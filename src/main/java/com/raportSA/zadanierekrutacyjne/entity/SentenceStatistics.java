package com.raportSA.zadanierekrutacyjne.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SentenceStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userInput;
    private String revertedSentence;
    private Long percentageOfSignsInSentence;
    private String duplicatedWords;

    public SentenceStatistics(Long id, String userInput, String revertedSentence, Long percentageOfSignsInSentence, String duplicatedWords) {
        this.id = id;
        this.userInput = userInput;
        this.revertedSentence = revertedSentence;
        this.percentageOfSignsInSentence = percentageOfSignsInSentence;
        this.duplicatedWords = duplicatedWords;
    }

    public SentenceStatistics(String userInput) {
        this.userInput = userInput;
    }

    public SentenceStatistics() {
    }

    @Override
    public String toString() {
        return "SentenceStatistics{" +
                "id=" + id +
                ", userInput='" + userInput + '\'' +
                ", revertedSentence='" + revertedSentence + '\'' +
                ", percentageOfSignsInSentence=" + percentageOfSignsInSentence +
                ", duplicatedWords='" + duplicatedWords + '\'' +
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

    public Long getPercentageOfSignsInSentence() {
        return percentageOfSignsInSentence;
    }

    public void setPercentageOfSignsInSentence(Long percentageOfSignsInSentence) {
        this.percentageOfSignsInSentence = percentageOfSignsInSentence;
    }

    public String getDuplicatedWords() {
        return duplicatedWords;
    }

    public void setDuplicatedWords(String duplicatedWords) {
        this.duplicatedWords = duplicatedWords;
    }
}
