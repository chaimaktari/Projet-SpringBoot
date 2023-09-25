package com.example.springbootproject.entite;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table( name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

}
