package com.example.springbootproject.service;

import com.example.springbootproject.entite.Reservation;
import com.example.springbootproject.entite.Universite;

import java.util.Date;
import java.util.List;

public interface IReservationService {

    List<Reservation> retrivieAllreservation();

    Reservation addReservation (Reservation r);


    Reservation updateReservation (Reservation r);

    Reservation retrieveReservation (String idReservation);

    void removeReservation  (String idReservation);
/*
    public List<Reservation> getReservationParAnneeUniversitaire(Date dateDebut , Date dateFin ); */

}
