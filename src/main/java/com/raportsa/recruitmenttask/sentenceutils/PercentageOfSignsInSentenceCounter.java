package com.raportsa.recruitmenttask.sentenceutils;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
public class PercentageOfSignsInSentenceCounter {

    private Long allCharsInSentence;


//    public Map<Character, Integer> signsCalculator(String input) {
//


    public Map<String, Double> searchedSigns(String input) {

        String [] stringArray = input.split("");

        Map<String, Double> result = new HashMap<>();
        for (String s : stringArray) {

            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1.0);
            } else {
                result.put(s, 1.0);
            }

            allCharsInSentence = input.subSequence(0, input.length()).chars().spliterator().estimateSize();

            Double percentageOfSignsInSentence = (result.get(s) / (double) allCharsInSentence) *100;

            result.put(s,percentageOfSignsInSentence);
        }

        return result;
    }


//        Predicate<String> signFilter = Pattern.compile(searchedSigns).asPredicate();
//        List<String> signsList = Arrays.asList(searchedSigns);
//        Long desiredSigns = signsList.stream().filter(signFilter).count();
//
//        return Math.round(percentageOfSignsInSentence);

//    }
}
