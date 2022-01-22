package com.raportsa.recruitmenttask.sentenceutils;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

@Component
public class PercentageOfSignsInSentenceCounter {

    private Long allCharsInSentence;


    public Long signsCalculator(String input, String searchedSignsInput) {
        String sentence = input;
        allCharsInSentence = sentence.subSequence(0, sentence.length()).chars().spliterator().estimateSize();
        String searchedSigns = searchedSignsInput; // - wprowadz znak lub ciąg znaków do policzenia

        Predicate<String> signFilter = Pattern.compile(searchedSigns).asPredicate();
        List<String> signsList = Arrays.asList(searchedSigns);
        Long desiredSigns = signsList.stream().filter(signFilter).count();
        Double percentageOfSignsInSentence = (double) desiredSigns * 100 / (double) allCharsInSentence;

        return Math.round(percentageOfSignsInSentence);

    }
}
