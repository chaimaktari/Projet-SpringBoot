package com.example.springbootproject.service;

import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Foyer;

import java.util.List;

public interface IBlocService {

    List<Bloc> retrieveAllBlocs();

    Bloc addBloc(Bloc b);

    Bloc updateBloc(Bloc b);

    Bloc retrieveBloc(Long idBloc);

    void removeBloc(Long idBloc);
}
