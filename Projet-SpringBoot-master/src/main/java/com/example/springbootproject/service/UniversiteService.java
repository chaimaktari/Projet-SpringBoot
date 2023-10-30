package com.example.springbootproject.service;


import com.example.springbootproject.Reposotory.UniversiteRepository;
import com.example.springbootproject.entite.Universite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
 public class UniversiteService implements IUniversiteService {

   UniversiteRepository universiteRepository;

   @Override
    public  List<Universite> retrivieAlluniversites(){
  return (List<Universite>) universiteRepository.findAll(); }


    @Override
    public Universite addUniversite(Universite u)
     {return  (Universite) universiteRepository.save(u);}


    @Override
    public Universite updateUniversity(Universite u)
    {return   universiteRepository.save(u);}

    @Override
    public Universite retrieveUniversity(long idUniversity) {return universiteRepository.findById(idUniversity).get() ; }

    @Override
    public void removeUniversity(long idUniversity) {

    }
}
