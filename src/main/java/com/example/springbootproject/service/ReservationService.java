package com.example.springbootproject.service;

import com.example.springbootproject.Reposotory.ReservationRepository;
import com.example.springbootproject.entite.Reservation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Slf4j
@Service
@AllArgsConstructor

public class ReservationService implements IReservationService {
   ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrivieAllreservation () {
        return (List<Reservation>) reservationRepository.findAll();}

    @Override
    public Reservation addReservation(Reservation r) {
        return (Reservation) reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);}

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public void removeReservation(String idReservation) {

    }

    public List<Reservation> getReservationParAnneeUniversitaire(Date dateDebut, Date dateFin) {
        List<Reservation> reservations = reservationRepository.findByAnneeUniversitaireBetween(dateDebut,dateFin);
        return reservations;
    }


}
