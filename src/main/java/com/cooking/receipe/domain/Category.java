package com.cooking.receipe.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String description;

    @ManyToMany(mappedBy = "category")
    private Set<Receipe>recipe;

    public long getId() {   return id ; }

    public void setId(long id) { this.id = id;  }

    public String getDepartmentName() { return description; }

    public void setDepartmentName(String departmentName) {    this.description = description;}

    public Set<Receipe> getRecipe() {  return recipe; }

    public void setRecipe(Set<Receipe> recipe) { this.recipe = recipe;}
}
