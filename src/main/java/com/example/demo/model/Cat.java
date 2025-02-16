package com.example.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

@Schema(description = "Represents a Cat class.")
public class Cat {

    @JsonUnwrapped
    @Schema(description = "The name.", nullable = true)
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
