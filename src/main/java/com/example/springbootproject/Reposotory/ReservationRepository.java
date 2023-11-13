package com.example.springbootproject.Reposotory;

import com.example.springbootproject.entite.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository  extends JpaRepository <Reservation, Long> {
    Reservation findByRes(String idReservation);
}
