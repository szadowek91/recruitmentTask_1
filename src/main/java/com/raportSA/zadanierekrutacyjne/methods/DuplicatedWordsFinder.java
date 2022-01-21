package com.raportSA.zadanierekrutacyjne.methods;

import java.util.HashMap;

public class DuplicatedWordsFinder {

    public HashMap<String, Integer> duplicatedWordsMap = new HashMap<>();

    public void fillDuplicatedWordsMap() {
        duplicatedWordsMap.put(wordFromList(),repeatingCounter());
        duplicatedWordsMap.put("pierwsze", 1);
        System.out.println(duplicatedWordsMap);
    }

    private String wordFromList(){ //tu będzie logika na rozdzielanie Stringa/zadanego tekstu (może pliku.txt) i wsadzanie w wartość key
        String word = "Hello";
        return word;
    }

    private Integer repeatingCounter(){ // tu będzie logika na zliczanie powtórzonych wartości key i wstawienie Integera w miejsce value
        Integer count = 1;
        return count;
    }

    @Override
    public String toString() {
        return "DuplicatedWordsFinder{" +
                "duplicatedWordsMap=" + duplicatedWordsMap +
                '}';
    }
}
