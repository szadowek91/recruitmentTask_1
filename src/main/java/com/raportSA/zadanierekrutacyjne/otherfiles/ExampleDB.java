package com.raportSA.zadanierekrutacyjne.otherfiles;

import com.raportSA.zadanierekrutacyjne.entity.SentenceStatistics;
import com.raportSA.zadanierekrutacyjne.repository.SentenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ExampleDB {

    private SentenceRepo sentenceRepo; // - tu utworzy się Bean

    @Autowired
    public ExampleDB(SentenceRepo sentenceRepo){
        this.sentenceRepo = sentenceRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void SentenceExampleDB() {
        ArrayList<SentenceStatistics> sentenceStatisticsList = new ArrayList();
        sentenceStatisticsList.add(new SentenceStatistics(1L, "zdanie sobie", "sobie zdanie", 3L, "brak duplikatów"));
        sentenceStatisticsList.add(new SentenceStatistics("tylko to co wpisuje user, reszte uzupełni automat - mam nadzieje !"));
        sentenceRepo.saveAll(sentenceStatisticsList);
    }
}

