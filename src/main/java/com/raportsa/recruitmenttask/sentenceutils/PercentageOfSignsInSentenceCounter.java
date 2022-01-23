package com.raportsa.recruitmenttask.sentenceutils;

import org.aspectj.weaver.patterns.KindedPointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Pattern;

@Component
public class PercentageOfSignsInSentenceCounter {

    private Long allCharsInSentence;


//    public Map<Character, Integer> signsCalculator(String input) {
//


        public Map<Character, Double> searchedSigns(String input) {

            char[] splittetChars = input.toCharArray();

            Map<Character, Double> result = new HashMap<>();
            for (char s : splittetChars) {
                allCharsInSentence = input.subSequence(0, input.length()).chars().spliterator().estimateSize();
                Double percentageOfSignsInSentence = (double) s * 100 / (double) allCharsInSentence;

                if (result.containsKey(s)) {
                    result.put(s, result.get(s) + percentageOfSignsInSentence);
                } else {
                    result.put(s, percentageOfSignsInSentence);
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
