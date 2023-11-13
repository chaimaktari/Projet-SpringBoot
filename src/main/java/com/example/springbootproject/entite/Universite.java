package com.example.springbootproject.entite;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table( name = "Universite")
public class Universite  implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idUniversite;
        private String nomUniversite;
        private String adresse;

    @OneToOne
    private Foyer foyer;

}
