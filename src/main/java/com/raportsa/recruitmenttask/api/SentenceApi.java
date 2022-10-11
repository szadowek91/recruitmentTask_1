package com.raportsa.recruitmenttask.api;

import com.raportsa.recruitmenttask.entity.SentenceStatisticsPatternForDB;
import com.raportsa.recruitmenttask.manager.SentenceManager;
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
    public Iterable<SentenceStatisticsPatternForDB> getAll() {
        return sentenceManager.findAll();
    }

    @GetMapping
    public Optional<SentenceStatisticsPatternForDB> getById(@RequestParam Long index) {
        return sentenceManager.findById(index);
    }

    @PostMapping
    public SentenceStatisticsPatternForDB addSentence(@RequestBody SentenceInputController sentenceInputController) {
        return sentenceManager.process(sentenceInputController);
    }

    @PutMapping
    public SentenceStatisticsPatternForDB updateSentence(@RequestBody SentenceStatisticsPatternForDB sentenceStatisticsPatternForDB) {
        return sentenceManager.save(sentenceStatisticsPatternForDB);
    }

    @DeleteMapping
    public void deleteSentence(@RequestParam Long index) {
        sentenceManager.deleteById(index);
    }
}
