package com.raportSA.zadanierekrutacyjne.api;

import com.raportSA.zadanierekrutacyjne.entity.SentenceStatistics;
import com.raportSA.zadanierekrutacyjne.manager.SentenceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/sentence")
public class SentenceApi {

    private SentenceManager sentenceManager;

    @Autowired
    public SentenceApi(SentenceManager sentenceManager) {
        this.sentenceManager = sentenceManager;
    }

    @GetMapping("/all")
    public Iterable<SentenceStatistics>getAll(){
        return sentenceManager.findAll();
    }

    @GetMapping
    public Optional<SentenceStatistics> getById(@RequestParam Long index){
        return sentenceManager.findById(index);
    }

    @PostMapping
    public SentenceStatistics addSentence(@RequestBody SentenceStatistics sentenceStatistics) {
        return sentenceManager.save(sentenceStatistics);
    }

    @PutMapping
    public SentenceStatistics updateSentence(@RequestBody SentenceStatistics sentenceStatistics) {
        return sentenceManager.save(sentenceStatistics);
    }
    @DeleteMapping
    public void deleteSentence(@RequestParam Long index) {
        sentenceManager.deleteById(index);
    }
}
