package com.raportsa.recruitmenttask.sentenceutils;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class SentenceReverser {


    public String reverse(String input) {
        List<String> words = Arrays.asList(input.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}