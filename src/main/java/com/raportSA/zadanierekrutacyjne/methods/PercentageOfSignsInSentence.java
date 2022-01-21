package com.raportSA.zadanierekrutacyjne.methods;

import com.raportSA.zadanierekrutacyjne.utils.ConsoleInput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PercentageOfSignsInSentence {

    private Long allCharsInSentence;

    public Long countSignsUsePercentage() {
        System.out.println("Wprowadź zdanie: ");
        String userInput = ConsoleInput.getInputUserString();
        allCharsInSentence = userInput.subSequence(0, userInput.length()).chars().spliterator().estimateSize();
        System.out.println("Liczba wszystkich znaków w wyrażeniu: " + allCharsInSentence);

        System.out.println("Wprowadź szukany znak/ciąg znaków: ");
        String searchedSign = ConsoleInput.getInputUserString();

        Predicate<String> signFilter = Pattern.compile(searchedSign).asPredicate();
        List<String> signs = Arrays.asList(searchedSign);
        Long desiredSigns = signs.stream().filter(signFilter).count();
        Double percentageOfSignsInSentence = (double) desiredSigns * 100 / (double) allCharsInSentence;

        return Math.round(percentageOfSignsInSentence);

    }

}
