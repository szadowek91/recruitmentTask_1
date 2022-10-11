package com.raportsa.recruitmenttask.sentenceutils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SentenceReverserTest {

    private final SentenceReverser sentenceReverser = new SentenceReverser();

    @Test
    void reverse_inputContainsASentence_shouldReturnSameSentenceWithWordsPlaceReverted(){
        //given
        String input = "powinno zamienić szyk wyrazów od końca do początku";
        String expectedResult = "początku do końca od wyrazów szyk zamienić powinno";
        //when
        var actualResult = sentenceReverser.reverse(input);
        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

}