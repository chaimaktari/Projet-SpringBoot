package com.example.springbootproject.entite;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
    @Table( name = "Reservation")
    public class Reservation{ //implements Serializable {
        @Id
        //@GeneratedValue(strategy = GenerationType.IDENTITY)
       // @Column(name="idReservation")
        private String idReservation; //
        private Date anneeUniversitaire ;
        private boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy="reservations")
    private Set<Etudiant> etudiant;
}

