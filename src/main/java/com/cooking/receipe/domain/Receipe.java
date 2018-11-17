package com.cooking.receipe.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Receipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;
    private String directions;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String url;


    @ManyToMany
    @JoinTable(name="recipe_category",
    joinColumns = @JoinColumn(name="recipe_id"),
    inverseJoinColumns = @JoinColumn(name="category_id"))
    private Set<Category>category = new HashSet<>();

    @Lob
    private Byte[] image;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    @OneToMany(cascade=CascadeType.ALL,mappedBy ="recipe" )
    private Set<Ingredient>  ingredient = new HashSet<>();



    @OneToOne
    private Notes notes;

    public long getId() { return id; }

    public void setId(long id) { this.id = id;    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return description;
    }

    public void setSource(String source) {
        this.description = source;
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

    public void setNotes(Notes notes) {this. notes.setReceipe(this);}

    public Set<Category> getCategory() {   return category; }

    public void setCategory(Set<Category> category) {  this.category = category;    }

    public Difficulty getDifficulty() {  return difficulty;    }

    public void setDifficulty(Difficulty difficulty) { this.difficulty = difficulty; }
}

