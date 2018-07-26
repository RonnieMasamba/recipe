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

    public long getId(){return id;}

    public void setId(long id){this.id = id;}

    public String getDescription(){return description; }

    public void setDescription(String description) { this.description = description;    }

    public BigDecimal getAmount() { return amount;}

    public void setAmount(BigDecimal amount) { this.amount = amount;}


}
