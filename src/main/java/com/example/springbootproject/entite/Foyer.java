package com.example.springbootproject.entite;

import jakarta.persistence.*;

import java.io.Serializable;


    @Entity
    @Table( name = "Foyer")
    public class Foyer implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="idFoyer")
        private long idFoyer;
        private String nomFoyer;
        private long capaciteFoyer;

    }
