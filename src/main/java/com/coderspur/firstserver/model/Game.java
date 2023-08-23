package com.coderspur.firstserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {

    @JsonProperty
    private String name;

    @JsonProperty
    private String genre;

    @JsonProperty
    private Double price;

    private Integer hours;

    public Game(String name, String genre, Double price, Integer hours) {
        this.name = name;
        this.genre = genre;
        this.price = price;
        this.hours = hours;
    }

    public Game() {
    }
}
