package com.raportsa.zadanierekrutacyjne.methods;

import com.raportsa.zadanierekrutacyjne.utils.ConsoleInput;
import org.springframework.context.annotation.Bean;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class RevertedSentence {

    @Bean
    public String setRevertedSentence() {
        List<String> sentenceToRevert = ConsoleInput.splitString();
        System.out.println("Before reversion: " + sentenceToRevert);
        Collections.reverse(sentenceToRevert);
        System.out.println("After reversion: " + sentenceToRevert);

        return sentenceToRevert.stream().map(String::valueOf).collect(Collectors.joining());
    }
}