package com.raportsa.recruitmenttask.manager;

import com.raportsa.recruitmenttask.api.SentenceInput;
import com.raportsa.recruitmenttask.entity.SentenceStatistics;
import com.raportsa.recruitmenttask.repository.SentenceRepo;
import com.raportsa.recruitmenttask.sentenceutils.DuplicatedWordsFinder;
import com.raportsa.recruitmenttask.sentenceutils.PercentageOfSignsInSentenceCounter;
import com.raportsa.recruitmenttask.sentenceutils.SentenceReverser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SentenceManager {

    private final SentenceRepo sentenceRepo;
    private final DuplicatedWordsFinder duplicatedWordsFinder;
    private final SentenceReverser sentenceReverser;
    private final PercentageOfSignsInSentenceCounter signsCalculator;

    @Autowired
    public SentenceManager(SentenceRepo sentenceRepo, DuplicatedWordsFinder duplicatedWordsFinder, SentenceReverser sentenceReverser, PercentageOfSignsInSentenceCounter signsCalculator) {
        this.sentenceRepo = sentenceRepo;
        this.duplicatedWordsFinder = duplicatedWordsFinder;
        this.sentenceReverser = sentenceReverser;
        this.signsCalculator = signsCalculator;
    }

    public Optional<SentenceStatistics> findById(Long id) {
        return sentenceRepo.findById(id);
    }

    public Iterable<SentenceStatistics> findAll() {
        return sentenceRepo.findAll();
    }

    public SentenceStatistics save(SentenceStatistics sentenceStatistics) {
        return sentenceRepo.save(sentenceStatistics);
    }

    public void deleteById(Long id) {
        sentenceRepo.deleteById(id);
    }

    public SentenceStatistics process(SentenceInput sentenceInput) {
        String input = sentenceInput.getInput();
        SentenceStatistics sentenceStatistics = new SentenceStatistics();
        sentenceStatistics.setUserInput(input);
        sentenceStatistics.setRevertedSentence(sentenceReverser.reverse(input));
        sentenceStatistics.setDuplicatedWords(duplicatedWordsFinder.findAndCountWords(input));
        sentenceStatistics.setPercentageOfSignsInSentence(signsCalculator.searchedSigns(input));
        return sentenceStatistics;
    }
}