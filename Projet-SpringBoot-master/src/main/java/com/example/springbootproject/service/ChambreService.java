package com.example.springbootproject.service;

import com.example.springbootproject.Reposotory.ChambreRepository;
import com.example.springbootproject.entite.Chambre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ChambreService implements IChambreService {
   ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrivieAllchambre() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return (Chambre) chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return (Chambre) chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public void removeChambre(long idChambre) {

    }
}
