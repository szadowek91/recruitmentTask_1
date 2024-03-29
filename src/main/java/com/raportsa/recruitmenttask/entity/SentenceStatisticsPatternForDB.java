package com.raportsa.recruitmenttask.entity;

import javax.persistence.*;
import java.util.Map;

@Entity
public class SentenceStatisticsPatternForDB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userInput;
    private String revertedSentence;
    @ElementCollection
    private Map<String, Double> percentageOfSignsInSentence;
    @ElementCollection
    private Map<String, Integer> duplicatedWords;

    public SentenceStatisticsPatternForDB(Long id, String userInput, String revertedSentence, Map<String, Double> percentageOfSignsInSentence, Map<String, Integer> duplicatedWords) {
        this.id = id;
        this.userInput = userInput;
        this.revertedSentence = revertedSentence;
        this.percentageOfSignsInSentence = percentageOfSignsInSentence;
        this.duplicatedWords = duplicatedWords;
    }

    public SentenceStatisticsPatternForDB(String userInput) {
        this.userInput = userInput;
    }

    public SentenceStatisticsPatternForDB() {
    }

    @Override
    public String toString() {
        return "SentenceStatistics{" +
                "id=" + id +
                ", userInput='" + userInput + '\'' +
                ", revertedSentence='" + revertedSentence + '\'' +
                ", percentageOfSignsInSentence=" + percentageOfSignsInSentence +
                ", duplicatedWords=" + duplicatedWords +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getRevertedSentence() {
        return revertedSentence;
    }

    public void setRevertedSentence(String revertedSentence) {
        this.revertedSentence = revertedSentence;
    }

    public Map<String, Double> getPercentageOfSignsInSentence() {
        return percentageOfSignsInSentence;
    }

    public void setPercentageOfSignsInSentence(Map<String, Double> percentageOfSignsInSentence) {
        this.percentageOfSignsInSentence = percentageOfSignsInSentence;
    }

    public Map<String, Integer> getDuplicatedWords() {
        return duplicatedWords;
    }

    public void setDuplicatedWords(Map<String, Integer> duplicatedWords) {
        this.duplicatedWords = duplicatedWords;
    }
}
