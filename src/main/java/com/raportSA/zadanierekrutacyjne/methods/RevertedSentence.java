package com.raportSA.zadanierekrutacyjne.methods;

import com.raportSA.zadanierekrutacyjne.utils.ConsoleInput;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class RevertedSentence {

    public String setRevertedSentence() {
        List<String> sentenceToRevert = ConsoleInput.splitString();
        System.out.println("Before reversion: " + sentenceToRevert);
        Collections.reverse(sentenceToRevert);
        System.out.println("After reversion: " + sentenceToRevert);

        return sentenceToRevert.stream().map(String::valueOf).collect(Collectors.joining());
    }
}