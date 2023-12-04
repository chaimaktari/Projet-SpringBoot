package com.example.springbootproject.Contolleur;

import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Reservation;
import com.example.springbootproject.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping ("/reservation")
public class ReservationContolleur {
    IReservationService reservationSerive;

    @GetMapping("/retrieve-all-reservation")
    public List<Reservation> getReservations() {
        List<Reservation> reservationList= reservationSerive.retrivieAllreservation();
        return reservationList;
    }
    @GetMapping ("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") String reservationId ) {
        return reservationSerive.retrieveReservation(reservationId);
    }

    //http://localhost:8089/foyer/bloc/retrieve-all-Blocs
    @PostMapping("/add-reservation")
    public Reservation addReservation (@RequestBody Reservation r) {
        Reservation reservation = reservationSerive.addReservation(r);
        return reservation; }

    @DeleteMapping ("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable ("reservation-id") String reservationId) {
        reservationSerive.removeReservation(reservationId); }

    @PutMapping ("/update-reservation")
    public   Reservation updateBloc(@RequestBody Reservation r){
        Reservation reservation = reservationSerive.updateReservation(r);
        return reservation; }
/*

    @GetMapping("/getReservationParAnneeUniversitaire/{dateDebut}/{dateFin}")
    public List<Reservation> getReservationParAnneeUniversitaire(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut, @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin) {
        List<Reservation> reservation = IReservationService.
        return reservation;
    }*/
}
