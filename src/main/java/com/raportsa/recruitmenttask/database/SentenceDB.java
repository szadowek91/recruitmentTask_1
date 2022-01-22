package com.raportsa.recruitmenttask.database;

import com.raportsa.recruitmenttask.entity.SentenceStatistics;
import com.raportsa.recruitmenttask.repository.SentenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;

@Repository
public class SentenceDB {

    private final SentenceRepo sentenceRepo; // - tu utworzy się Bean

    @Autowired
    public SentenceDB(SentenceRepo sentenceRepo) {
        this.sentenceRepo = sentenceRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void sentenceExampleDB() {
        ArrayList<SentenceStatistics> sentenceStatisticsList = new ArrayList();
        sentenceStatisticsList.add(new SentenceStatistics(1L, "zdanie sobie", "sobie zdanie", 3L, Map.of("zdanie", 1, "sobie", 1)));
        sentenceStatisticsList.add(new SentenceStatistics("tylko to co wpisuje user, reszte uzupełni automat - mam nadzieje !"));
        sentenceRepo.saveAll(sentenceStatisticsList);
    }
}

