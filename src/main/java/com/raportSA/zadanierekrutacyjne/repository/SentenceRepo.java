package com.raportSA.zadanierekrutacyjne.repository;


import com.raportSA.zadanierekrutacyjne.entity.SentenceStatistics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentenceRepo extends CrudRepository<SentenceStatistics,Long> {
}
