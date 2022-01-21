package com.raportSA.zadanierekrutacyjne.manager;

import com.raportSA.zadanierekrutacyjne.entity.SentenceStatistics;
import com.raportSA.zadanierekrutacyjne.repository.SentenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SentenceManager {

    private SentenceRepo sentenceRepo;

    @Autowired
    public SentenceManager(SentenceRepo sentenceRepo) {
        this.sentenceRepo = sentenceRepo;
    }

    public Optional<SentenceStatistics> findById(Long id){
        return sentenceRepo.findById(id);
    }

    public Iterable<SentenceStatistics> findAll(){
        return sentenceRepo.findAll();
    }
    public SentenceStatistics save(SentenceStatistics sentenceStatistics){
        return sentenceRepo.save(sentenceStatistics);
    }
    public void deleteById(Long id){
        sentenceRepo.deleteById(id);
    }
}
