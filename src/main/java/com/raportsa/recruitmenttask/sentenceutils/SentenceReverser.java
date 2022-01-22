package com.raportsa.recruitmenttask.sentenceutils;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class SentenceReverser {


    public String reverse(String input) {
        String[] splittedWords = input.split(" ");
        Collections.reverse(List.of(splittedWords));

        return String.valueOf(Arrays.stream(splittedWords).distinct());
    }
}