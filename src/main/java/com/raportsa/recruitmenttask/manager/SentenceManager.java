package com.raportsa.recruitmenttask.manager;

import com.raportsa.recruitmenttask.api.SentenceInputController;
import com.raportsa.recruitmenttask.entity.SentenceStatisticsPatternForDB;
import com.raportsa.recruitmenttask.repository.SentenceRepository;
import com.raportsa.recruitmenttask.sentenceutils.DuplicatedWordsFinder;
import com.raportsa.recruitmenttask.sentenceutils.PercentageOfSignsInSentenceCounter;
import com.raportsa.recruitmenttask.sentenceutils.SentenceReverser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SentenceManager {

    private final SentenceRepository sentenceRepository;
    private final DuplicatedWordsFinder duplicatedWordsFinder;
    private final SentenceReverser sentenceReverser;
    private final PercentageOfSignsInSentenceCounter signsCalculator;

    @Autowired
    public SentenceManager(SentenceRepository sentenceRepository, DuplicatedWordsFinder duplicatedWordsFinder, SentenceReverser sentenceReverser, PercentageOfSignsInSentenceCounter signsCalculator) {
        this.sentenceRepository = sentenceRepository;
        this.duplicatedWordsFinder = duplicatedWordsFinder;
        this.sentenceReverser = sentenceReverser;
        this.signsCalculator = signsCalculator;
    }

    public Optional<SentenceStatisticsPatternForDB> findById(Long id) {
        return sentenceRepository.findById(id);
    }

    public Iterable<SentenceStatisticsPatternForDB> findAll() {
        return sentenceRepository.findAll();
    }

    public SentenceStatisticsPatternForDB save(SentenceStatisticsPatternForDB sentenceStatisticsPatternForDB) {
        return sentenceRepository.save(sentenceStatisticsPatternForDB);
    }

    public void deleteById(Long id) {
        sentenceRepository.deleteById(id);
    }

    public SentenceStatisticsPatternForDB process(SentenceInputController sentenceInputController) {
        String input = sentenceInputController.getInput();
        SentenceStatisticsPatternForDB sentenceStatisticsPatternForDB = new SentenceStatisticsPatternForDB();
        sentenceStatisticsPatternForDB.setUserInput(input);
        sentenceStatisticsPatternForDB.setRevertedSentence(sentenceReverser.reverse(input));
        sentenceStatisticsPatternForDB.setDuplicatedWords(duplicatedWordsFinder.findAndCountWords(input));
        sentenceStatisticsPatternForDB.setPercentageOfSignsInSentence(signsCalculator.searchedSigns(input));
        save(sentenceStatisticsPatternForDB);
        return sentenceStatisticsPatternForDB;
    }
}