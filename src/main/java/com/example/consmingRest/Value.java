package com.example.consmingRest;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private String quote;
    private Long id;

    public Value () {
    }

    public String getQuote() {
        return quote;
    }

    public Long getId() {
        return id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
