package com.cooking.receipe.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String notes;

    @OneToOne(cascade = CascadeType.ALL)
    private Receipe receipe;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Receipe getReceipe() { return receipe;
    }

    public void setReceipe(Receipe receipe) {  this.receipe = receipe;}    }
