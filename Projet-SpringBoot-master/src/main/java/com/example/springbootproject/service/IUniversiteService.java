package com.example.springbootproject.service;

import com.example.springbootproject.entite.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrivieAlluniversites();

    Universite  addUniversite (Universite u);


    Universite updateUniversity (Universite u);

    Universite retrieveUniversity (long idUniversity);

    void removeUniversity  (long idUniversity );

}
