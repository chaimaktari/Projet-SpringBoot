package com.example.springbootproject.Reposotory;

import com.example.springbootproject.entite.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EtudiantRepository extends JpaRepository <Etudiant, Long > {

    Etudiant findByNomEtAndPrenomEt(String nomEt, String prenomEt);
}
