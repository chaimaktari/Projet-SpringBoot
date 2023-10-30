package com.example.springbootproject.entite;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity

public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;



}