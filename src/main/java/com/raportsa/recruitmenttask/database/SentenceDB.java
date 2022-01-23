package com.raportsa.recruitmenttask.database;

import com.raportsa.recruitmenttask.entity.SentenceStatisticsPatternForDB;
import com.raportsa.recruitmenttask.repository.SentenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;

@Repository
public class SentenceDB {

    private final SentenceRepository sentenceRepository;

    @Autowired
    public SentenceDB(SentenceRepository sentenceRepository) {
        this.sentenceRepository = sentenceRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void sentenceExampleDB() {
        ArrayList<SentenceStatisticsPatternForDB> sentenceStatisticsPatternForDBList = new ArrayList();
        sentenceStatisticsPatternForDBList.add(new SentenceStatisticsPatternForDB(1L, "zdanie sobie", "sobie zdanie", Map.of("z", 1.0, "d", 1.0, "a", 1.0, "n", 1.0, "i", 1.0, "e", 1.0, " ", 1.0, "s", 1.0, "o", 1.0, "b", 1.0), Map.of("zdanie", 1, "sobie", 1)));
        sentenceStatisticsPatternForDBList.add(new SentenceStatisticsPatternForDB("tylko to co wpisuje user, reszte uzupełni automat - mam nadzieje !"));
        sentenceRepository.saveAll(sentenceStatisticsPatternForDBList);
    }
}

