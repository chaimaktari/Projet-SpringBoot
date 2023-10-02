package com.example.springbootproject.entite;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;


@Entity
  //  @Table( name = "Foyer")
    public class Foyer implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
      //  @Column(name = "idFoyer")
        private Long idFoyer;
        private String nomFoyer;
        private Long capaciteFoyer;
    @OneToOne(mappedBy="foyer")
    private Universite universite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> blocs;

    }
