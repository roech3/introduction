package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.UUID;

public class Person implements Serializable {

    private final UUID id;
    @NotBlank
    private final String name;

    private final String height;

    private final int weight;

    private final int age;

    private final String career;





    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name,
                  @JsonProperty("height") String height,
                  @JsonProperty("weight") int weight,
                  @JsonProperty("age") int age,
                  @JsonProperty("career") String career) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.career = career;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getheight() { return height;}

    public int getweight() { return weight;}

    public int getage() { return age;}

    public String getcareer() { return career;}
}
