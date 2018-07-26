package com.cooking.receipe.domain;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Receipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String prepTime;
    private String cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    @Lob
    private Byte[] image;

   // @Enumerated(EnumType.STRING)
   // private Difficulty difficulty;

    // private Set<Ingredient> ingredient;

    // private Notes notes;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }

    public String getCookTime() {
        return cookTime;
    }

    public void setCookTime(String cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

}

