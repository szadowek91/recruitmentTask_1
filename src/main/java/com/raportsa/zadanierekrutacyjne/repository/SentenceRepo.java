package com.raportsa.zadanierekrutacyjne.repository;


import com.raportsa.zadanierekrutacyjne.entity.SentenceStatistics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentenceRepo extends CrudRepository<SentenceStatistics, Long> {
}
