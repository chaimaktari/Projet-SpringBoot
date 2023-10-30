package com.example.springbootproject.service;

import com.example.springbootproject.Reposotory.EtudiantRepository;
import com.example.springbootproject.Reposotory.UniversiteRepository;
import com.example.springbootproject.entite.Etudiant;
import com.example.springbootproject.entite.Universite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class EtudiantService implements  IEtudiantService  {
    EtudiantRepository etudiantReposotory;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
       return (List<Etudiant>) etudiantReposotory.findAll();

    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return (Etudiant) etudiantReposotory.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return (Etudiant) etudiantReposotory.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantReposotory.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {

    }
}
