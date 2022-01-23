package com.raportsa.recruitmenttask.sentenceutils;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DuplicatedWordsFinderTest {

    private final DuplicatedWordsFinder duplicatedWordsFinder = new DuplicatedWordsFinder();

    @Test
    void findAndCountWords_inputContainsThreeWordsWithOneDuplicate_shouldReturnMapWithCountedWords() {
        // given
        String input = "wprowadzone zdanie zdanie";
        Map<String, Integer> expectedOutput = Map.of("wprowadzone", 1, "zdanie", 2);
        // when
        var actualResult = duplicatedWordsFinder.findAndCountWords(input);
        // then
        assertThat(actualResult).isEqualTo(expectedOutput);

    }

}