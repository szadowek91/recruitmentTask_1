package com.raportsa.recruitmenttask.sentenceutils;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PercentageOfSignsInSentenceCounterTest {

    private final PercentageOfSignsInSentenceCounter percentageOfSignsInSentenceCounter = new PercentageOfSignsInSentenceCounter();

    @Test
    void searchedSigns_inputContainsFourDifferentSigns_shouldReturnMapWithPercentageInSentenceForEverySign() {
        // given
        String input = "aaaabbbccd";
        Map<String, Double> expectedResult = Map.of("a", 40.0, "b", 30.0, "c", 20.0, "d", 10.0);
        // when
        var actualResult = percentageOfSignsInSentenceCounter.searchedSigns(input);
        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
