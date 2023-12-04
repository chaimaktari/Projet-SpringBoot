package com.example.springbootproject.service;

import com.example.springbootproject.Reposotory.BlocRepository;
import com.example.springbootproject.Reposotory.ChambreRepository;
import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Chambre;
import com.example.springbootproject.entite.TypeChambre;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
@Slf4j

public class ChambreService implements IChambreService {
   ChambreRepository chambreRepository;
   BlocRepository blocRepository;
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


/*

    @Override
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc) {
        List<Chambre> chambre = chambreRepository.findByTypeCAndBlocIdBloc(type,idBloc);
        return  chambre.size();
    }
/*
    @Override
    public Set<Chambre> getChambresParNomBloc(String nomBloc) {
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);
        return bloc.getChambres();*/




@Scheduled  (fixedRate =  10000)

    public void listeChambresParBloc(){
     blocRepository.findAll().forEach(
            bloc -> {log.info("nomBloc" + bloc.getNomBloc()+ "capaciter" +bloc.getCapaciteBloc());
               log.info("liste des chambres de :"+ bloc.getNomBloc());
               bloc.getChambres().forEach(chambre ->
                       log.info("Numero chambres: " +chambre.getNumeroChambre()+ " de type: " +chambre.getTypeC() )) ;
            }
    );
    }


  }






