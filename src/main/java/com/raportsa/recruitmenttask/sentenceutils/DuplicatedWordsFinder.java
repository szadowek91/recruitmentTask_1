package com.raportsa.recruitmenttask.sentenceutils;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DuplicatedWordsFinder {

    public Map<String, Integer> findAndCountWords(String input) {
        String[] splittedWords = input.split(" ");

        Map<String, Integer> result = new HashMap<>();
        for (String s : splittedWords) {

            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            } else {
                result.put(s, 1);
            }
        }
        return result;
    }
}