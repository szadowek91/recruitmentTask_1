package com.raportsa.recruitmenttask.repository;

import com.raportsa.recruitmenttask.entity.SentenceStatisticsPatternForDB;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentenceRepository extends CrudRepository<SentenceStatisticsPatternForDB, Long> {
}
