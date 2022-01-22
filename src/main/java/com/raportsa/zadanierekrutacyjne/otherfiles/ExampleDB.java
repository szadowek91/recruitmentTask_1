package com.raportsa.zadanierekrutacyjne.otherfiles;

import com.raportsa.zadanierekrutacyjne.entity.SentenceStatistics;
import com.raportsa.zadanierekrutacyjne.repository.SentenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ExampleDB {

    private final SentenceRepo sentenceRepo; // - tu utworzy się Bean

    @Autowired
    public ExampleDB(SentenceRepo sentenceRepo) {
        this.sentenceRepo = sentenceRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void sentenceExampleDB() {
        ArrayList<SentenceStatistics> sentenceStatisticsList = new ArrayList();
        sentenceStatisticsList.add(new SentenceStatistics(1L, "zdanie sobie", "sobie zdanie", 3L, "brak duplikatów"));
        sentenceStatisticsList.add(new SentenceStatistics("tylko to co wpisuje user, reszte uzupełni automat - mam nadzieje !"));
        sentenceRepo.saveAll(sentenceStatisticsList);
    }
}

