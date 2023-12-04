package com.example.springbootproject.entite;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table ( name = "Etudiant")

    public class Etudiant implements Serializable {
        @Id
        @GeneratedValue  (strategy = GenerationType.IDENTITY)
        @Column(name="idEtudiant")
        private Long idEtudiant;
         private String nomEt;
         private String prenomEt;
          private Long cin;
          private String ecole;
            @Temporal(TemporalType.DATE)
            private Date dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}

// Constructeur et accesseurs (getters) et mutateurs (setters)