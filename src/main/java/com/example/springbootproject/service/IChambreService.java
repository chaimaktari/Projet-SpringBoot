package com.example.springbootproject.service;

import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Chambre;
import com.example.springbootproject.entite.Reservation;
import com.example.springbootproject.entite.TypeChambre;

import java.util.List;
import java.util.Set;

public interface IChambreService {

    List<Chambre> retrivieAllchambre();

    Chambre addChambre (Chambre c);


    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);

    void removeChambre (long idChambre);

  /*  public Set<Chambre> getChambresParNomBloc(String nomBloc );*/
/*
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc );*/
}
