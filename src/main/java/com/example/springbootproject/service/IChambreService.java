package com.example.springbootproject.service;

import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Chambre;
import com.example.springbootproject.entite.Reservation;

import java.util.List;

public interface IChambreService {

    List<Chambre> retrivieAllchambre();

    Chambre addChambre (Chambre c);


    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);

    void removeChambre (long idChambre);


}
