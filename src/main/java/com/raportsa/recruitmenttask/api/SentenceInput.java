package com.raportsa.recruitmenttask.api;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceInput {

    private String input;

    public SentenceInput() {
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
