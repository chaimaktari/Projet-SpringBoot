package com.example.springbootproject.service;

import com.example.springbootproject.entite.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEtudiantService  {


        List<Etudiant> retrieveAllEtudiants();

        Etudiant addEtudiant(Etudiant e);

        Etudiant updateEtudiant(Etudiant e);

        Etudiant retrieveEtudiant(Long idEtudiant);

        void removeEtudiant(Long idEtudiant);

        Etudiant  affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation);
}
