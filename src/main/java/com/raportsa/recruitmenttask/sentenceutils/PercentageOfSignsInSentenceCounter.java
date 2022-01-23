package com.raportsa.recruitmenttask.sentenceutils;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class PercentageOfSignsInSentenceCounter {

    private Long allCharsInSentence;

    public Map<String, Double> searchedSigns(String input) {
        double inputLength = input.length();

        Map<String, Double> percentageOfSigns = new HashMap<>();

        Map<String, Long> signsAmount = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        signsAmount.forEach((k, v) -> percentageOfSigns.put(k, Math.round((v / inputLength * 100) * 10) / 10.0));

        return percentageOfSigns.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}


    /*
this piece of code below maybe could be used,
if user inputs second input named "searchedSigns" (used as pattern to search exactly what user need to find [sign or a phrase])

//        Predicate<String> signFilter = Pattern.compile(searchedSigns).asPredicate();
//        List<String> signsList = Arrays.asList(searchedSigns);
//        Long desiredSigns = signsList.stream().filter(signFilter).count();
    */