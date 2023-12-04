package com.example.springbootproject.service;


import com.example.springbootproject.Reposotory.FoyerRepository;
import com.example.springbootproject.Reposotory.UniversiteRepository;
import com.example.springbootproject.entite.Foyer;
import com.example.springbootproject.entite.Universite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
 public class UniversiteService implements IUniversiteService {

    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;
    @Override
    public List<Universite> retrivieAlluniversites() {
        return (List<Universite>) universiteRepository.findAll();
    }


    @Override
    public Universite addUniversite(Universite u) {
        return (Universite) universiteRepository.save(u);
    }


    @Override
    public Universite updateUniversity(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity) {
        return universiteRepository.findById(idUniversity).get();
    }

    @Override
    public void removeUniversity(long idUniversity) {

    }

    @Override
    public Universite affecterFoyerAUniversite(long idUniversite, String nomFoyer) {
        Universite universite =  universiteRepository.findById(idUniversite).get();
        Foyer foyer = foyerRepository.findByNomFoyer(nomFoyer);
        universite.setFoyer(foyer);
        universiteRepository.save(universite);
         return universite;
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).get();
        universite.setFoyer(null);
        universiteRepository.save(universite);
        return  universite;
    }


}

// meth 2 c com com
//  @Override
//    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) ; {
//        Foyer foyer =  foyerRepository.findById(idFoyer).get();
//        Universite universite = universiteRepository.findByNom(nomUniversite);
//        Universite.setFoyer(foyer);  //parent
//        universiteRepository.save(universite);
//         return universite;
//    }