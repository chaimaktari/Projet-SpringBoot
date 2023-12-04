package com.example.springbootproject.Reposotory;

import com.example.springbootproject.entite.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository  extends JpaRepository <Reservation, String> {
    Reservation findByIdReservation(String idReservation);
    List<Reservation> findByAnneeUniversitaireBetween(Date dateDebut, Date dateFin);
}
