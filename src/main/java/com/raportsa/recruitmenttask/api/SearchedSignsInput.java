package com.raportsa.recruitmenttask.api;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchedSignsInput {

    private String searchedSignsInput;

    public SearchedSignsInput() {
    }

    public String getSearchedSignsInput() {
        return searchedSignsInput;
    }

    public void setSearchedSignsInput(String searchedSignsInput) {
        this.searchedSignsInput = searchedSignsInput;
    }
}
