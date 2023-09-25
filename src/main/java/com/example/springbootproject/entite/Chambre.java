package com.example.springbootproject.entite;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table( name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
    private long idChambre;
    private long numeroChambre;
}
