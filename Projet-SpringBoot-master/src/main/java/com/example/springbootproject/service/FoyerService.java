package com.example.springbootproject.service;

import com.example.springbootproject.Reposotory.FoyerRepository;
import com.example.springbootproject.entite.Foyer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class FoyerService  implements  IFoyerService{
   FoyerRepository foyerRepository;


    @Override
    public List<Foyer> retrievieAllFoyer() {
        return null;
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return null;
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return null;
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return null;
    }

    @Override
    public void removeFoyer(long idFoyer) {

    }
}



