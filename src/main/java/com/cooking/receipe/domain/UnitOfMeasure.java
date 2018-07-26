package com.cooking.receipe.domain;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String  unitOfMeasure;

     public long getId() {  return id; }

    public void setId(long id) { this.id = id; }

    public String getUnitOfMeasure() {  return unitOfMeasure; }

    public void setUnitOfMeasure(String unitOfMeasure) { this.unitOfMeasure = unitOfMeasure; }


    }


