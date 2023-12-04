package com.example.springbootproject.Contolleur;

import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Chambre;
import com.example.springbootproject.service.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")

public class ChambreControlleur  {
    IChambreService  chambreService;


    //http://localhost:8089/foyer/bloc/retrieve-all-Blocs
    @GetMapping("/retrieve-all-Chambre")
    public List<Chambre> getChambres() {
        List<Chambre> listChambre= chambreService.retrivieAllchambre();
        return listChambre;
    }
    @GetMapping ("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chambreId ) {
        return chambreService.retrieveChambre(chambreId);
    }

    //http://localhost:8089/foyer/bloc/retrieve-all-Blocs
    @PostMapping("/add-chambre")
    public Chambre addChambre (@RequestBody Chambre c) {
        Chambre  chambre = chambreService.addChambre(c);
        return chambre; }

    @DeleteMapping ("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable ("chambre-id") Long chambreId) {
        chambreService.removeChambre(chambreId); }

    @PutMapping ("/update-chambre")
    public   Chambre updateChambre(@RequestBody Chambre c){
        Chambre chambre = chambreService.updateChambre(c);
        return chambre; }
}
