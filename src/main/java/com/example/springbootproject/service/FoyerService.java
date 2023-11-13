package com.example.springbootproject.service;

import com.example.springbootproject.Reposotory.FoyerRepository;
import com.example.springbootproject.entite.Foyer;
import com.example.springbootproject.entite.Universite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class FoyerService  implements  IFoyerService {
    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrievieAllFoyer() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return (Foyer) foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(long idFoyer) {
    }


}







