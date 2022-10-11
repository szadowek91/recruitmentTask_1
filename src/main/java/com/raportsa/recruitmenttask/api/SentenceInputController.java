package com.raportsa.recruitmenttask.api;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceInputController {

    private String input;

    public SentenceInputController() {
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
