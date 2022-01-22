package com.raportsa.recruitmenttask.repository;


import com.raportsa.recruitmenttask.entity.SentenceStatistics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentenceRepo extends CrudRepository<SentenceStatistics, Long> {
}
