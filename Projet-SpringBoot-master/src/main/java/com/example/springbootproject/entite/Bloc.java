package com.example.springbootproject.entite;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  @Column(name="idBloc")
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;


    @ManyToOne
    Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloc")
    private Set<Chambre> chambres;
}
