package com.example.springbootproject.service;

import com.example.springbootproject.Reposotory.EtudiantRepository;
import com.example.springbootproject.Reposotory.ReservationRepository;
import com.example.springbootproject.Reposotory.UniversiteRepository;
import com.example.springbootproject.entite.Etudiant;
import com.example.springbootproject.entite.Reservation;
import com.example.springbootproject.entite.Universite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor

public class EtudiantService implements  IEtudiantService {
    EtudiantRepository etudiantReposotory;
    ReservationRepository reservationRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantReposotory.findAll();

    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return (Etudiant) etudiantReposotory.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return (Etudiant) etudiantReposotory.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantReposotory.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {

    }

    @Override
    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation) {
        Etudiant etudiant = etudiantReposotory.findByPrenomEt(prenomEt);
        Etudiant etudiant1 = etudiantReposotory.findByNomEt(nomEt);
        Reservation reservation = reservationRepository.findByRes(idReservation);
       // List<Reservation> affectation = new ArrayList<>();
        List<Etudiant> affectation = new ArrayList<>();
        if (etudiant1 != null && etudiant != null && reservation != null) {
            etudiant.setNomEt(nomEt);
            etudiant.setPrenomEt(prenomEt);

            etudiantReposotory.save(etudiant1);
           // return etudiant;

        }
        return etudiant;
    }}




