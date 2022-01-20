package com.raportSA.zadanierekrutacyjne.service;

import com.raportSA.zadanierekrutacyjne.utils.ConsoleInput;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class RevertedSentence {

    public void setRevertedSentence() {
        List<String> sentenceToRevert = Arrays.asList(ConsoleInput.getInputUserString().split(" "));
        System.out.println("Before reversion: " + sentenceToRevert);
        Collections.reverse(sentenceToRevert);
        System.out.println("After reversion: " + sentenceToRevert);

    }
}