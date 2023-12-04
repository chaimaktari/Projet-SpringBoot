package com.example.springbootproject.service;

import com.example.springbootproject.Reposotory.BlocRepository;
import com.example.springbootproject.Reposotory.ChambreRepository;
import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Chambre;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Set;

@Slf4j
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
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);
        for (Long nC : numChambre ){
            Chambre chambre = chambreRepository.findByNumeroChambre(nC);
            chambre.setBloc(bloc);
            chambreRepository.save(chambre);
        }
        return bloc;
    }

  /*  @Scheduled (fixedRate =  60000)
    void listeChambresParBloc(){
    List<Bloc> bloc =blocRepository.findAll();
    bloc.forEach(ch -> {
        log.info("Bloc " + ch.getNomBloc() + "ayant capacite de" + ch.getCapaciteBloc());
        log.info("liste des chambres bloc" + ch.getNomBloc());
        Set<Chambre> chambre = ch.getChambres();
        chambre.forEach(cha ->{
        log.info("chambre numero " + cha.getNumeroChambre() + "de type" + cha.getTypeC() );
        });
    });
    }*/
}



