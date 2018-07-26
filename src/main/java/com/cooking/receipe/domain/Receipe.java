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

    @ManyToMany
    @JoinTable(name="recipe_category",
    joinColumns = @JoinColumn(name="recipe_id"),
    inverseJoinColumns = @JoinColumn(name="category_id"))
    private Set<Category>category;

    @Lob
    private Byte[] image;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    @OneToMany(cascade=CascadeType.ALL,mappedBy ="recipe" )
    private Set<Ingredient>  ingredient;

    @OneToOne
    private Notes notes;

    public long getId() { return id; }

    public void setId(long id) { this.id = id;    }

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

    public Set<Ingredient> getIngredient() { return ingredient;  }

    public void setIngredient(Set<Ingredient> ingredient) { this.ingredient = ingredient;}

    public Notes getNotes() {  return notes;}

    public void setNotes(Notes notes) {  this.notes = notes;    }

    public Set<Category> getCategory() {   return category; }

    public void setCategory(Set<Category> category) {  this.category = category;    }

    public Difficulty getDifficulty() {  return difficulty;    }

    public void setDifficulty(Difficulty difficulty) { this.difficulty = difficulty; }
}

