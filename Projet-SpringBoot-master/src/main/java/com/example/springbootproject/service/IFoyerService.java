package com.example.springbootproject.service;

import com.example.springbootproject.entite.Foyer;
import com.example.springbootproject.entite.Reservation;

import java.util.List;

public interface IFoyerService {

    List<Foyer> retrievieAllFoyer();

    Foyer addFoyer (Foyer f);


    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (long idFoyer);

    void removeFoyer  (long idFoyer);
}
