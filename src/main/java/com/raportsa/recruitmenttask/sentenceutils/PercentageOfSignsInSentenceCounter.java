package com.raportsa.recruitmenttask.sentenceutils;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PercentageOfSignsInSentenceCounter {

    private Long allCharsInSentence;


//    public Map<Character, Integer> signsCalculator(String input) {
//


        public Map<String, Double> searchedSigns(String input) {

            char[] splittetChars = input.toCharArray();

            Map<String, Double> result = new HashMap<>();
            for (Character s : splittetChars) {
                allCharsInSentence = input.subSequence(0, input.length()).chars().spliterator().estimateSize();
                Double percentageOfSignsInSentence = (double) s * 100 / (double) allCharsInSentence;

                if (result.containsKey(s)) {
                    result.put(s.toString(), result.get(s) + percentageOfSignsInSentence);
                } else {
                    result.put(s.toString(), percentageOfSignsInSentence);
                }
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
