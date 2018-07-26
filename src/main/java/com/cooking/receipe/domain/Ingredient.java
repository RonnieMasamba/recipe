package com.cooking.receipe.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String description;
    private BigDecimal amount;


    @ManyToOne(fetch =FetchType.LAZY)
    private Receipe recipe;

    @OneToOne
    private UnitOfMeasure unitOfMeasure;

    @OneToOne(fetch = FetchType.EAGER)
    private Notes note;

    public Receipe getRecipe() {return recipe; }

    public void setRecipe(Receipe recipe) {  this.recipe = recipe;}

    public long getId(){return id;}

    public void setId(long id){this.id = id;}

    public String getDescription(){return description; }

    public void setDescription(String description) { this.description = description;    }

    public BigDecimal getAmount() { return amount;}

    public void setAmount(BigDecimal amount) { this.amount = amount;}

    public Notes getNote() { return note; }

    public void setNote(Notes note) {   this.note = note;}



}

