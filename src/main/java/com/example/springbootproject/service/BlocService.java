package com.example.springbootproject.service;

import com.example.springbootproject.Reposotory.BlocRepository;
import com.example.springbootproject.Reposotory.ChambreRepository;
import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Chambre;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class BlocService implements  IBlocService {
    BlocRepository blocRepository;
    ChambreRepository chambreRepository;


    @Override
    public List<Bloc> retrieveAllBlocs() {
        return (List<Bloc>) blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return (Bloc) blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return (Bloc) blocRepository.save(b);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) { }

    @Override
    public void affecterChambresABloc(List<Long> numChambre, String nomBloc) {

        Bloc bloc = blocRepository.findByBloc(nomBloc);
        List<Chambre> list = chambreRepository.findAllById(numChambre);
        bloc.setChambres(list);
       blocRepository.save(bloc);
    }

}




