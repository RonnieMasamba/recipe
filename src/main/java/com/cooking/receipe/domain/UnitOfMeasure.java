package com.cooking.receipe.domain;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String  description;

    @OneToOne
    private Ingredient ingredient;

     public long getId() {  return id; }

    public void setId(long id) { this.id = id; }

    public String getUnitOfMeasure() {  return description; }

    public void setUnitOfMeasure(String unitOfMeasure) { this.description = description; }


    }


