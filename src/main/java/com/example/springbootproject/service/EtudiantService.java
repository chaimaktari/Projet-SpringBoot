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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        return etudiantReposotory.save(e);
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
        Etudiant etudiant = etudiantReposotory.findByNomEtAndPrenomEt(nomEt,prenomEt);
        Reservation reservation = reservationRepository.findByIdReservation(idReservation);
        Set<Reservation> reservationsMiseAJour = new HashSet<>();
        if(etudiant.getReservations()!=null){
            reservationsMiseAJour=etudiant.getReservations();
        }
        reservationsMiseAJour.add(reservation);
        etudiant.setReservations(reservationsMiseAJour);
        etudiantReposotory.save(etudiant);
        return etudiant;
        }
    }





