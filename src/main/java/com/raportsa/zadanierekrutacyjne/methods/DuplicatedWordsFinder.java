package com.raportsa.zadanierekrutacyjne.methods;

import com.raportsa.zadanierekrutacyjne.utils.ConsoleInput;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DuplicatedWordsFinder {

    @Bean
    public String findAndCountWords() {
        List<String> splittedWords = ConsoleInput.splitString();

        Map<String, Integer> result = new HashMap<>();
        for (String s : splittedWords) {

            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            } else {
                result.put(s, 1);
            }
        }
        return String.valueOf(result);
    }
}
