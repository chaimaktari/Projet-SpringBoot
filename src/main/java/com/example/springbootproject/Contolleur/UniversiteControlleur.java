package com.example.springbootproject.Contolleur;

import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Universite;
import com.example.springbootproject.service.IUniversiteService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping ("/universites")

public class UniversiteControlleur {
    IUniversiteService  universiteService;

    @GetMapping ("/retrivie-all-universities")
    public List<Universite>getUniversites (){
        List<Universite> listUniversite = universiteService.retrivieAlluniversites();
        return listUniversite;
    }


    @GetMapping ("/retrieve-universites/{universites-id}")
    public Universite retrieveuniversite(@PathVariable("universite-id") Long UniversiteId ) {
        return universiteService.retrieveUniversity(UniversiteId);
    }

    //http://localhost:8089/foyer/bloc/retrieve-all-Blocs
    @PostMapping("/add-university")
    public Universite addUniversite (@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite; }

    @DeleteMapping ("/remove-universites/{universites-id}")
    public void removeUniversite(@PathVariable ("universite-id") Long universiteId) {
        universiteService.removeUniversity(universiteId); }

    @PutMapping ("/update-universite")
    public   Universite updateUniversite(@RequestBody Universite u){
        Universite universite = universiteService.updateUniversity(u);
        return universite; }


    @PostMapping( "/affecterFoyerAUniversite/{idUniversite}")
    @ResponseBody
    public Universite affecterFoyerAUniversite (@PathVariable ("idUniversite") Long idUniversite, @PathVariable ("nomFoyer") String nomFoyer ){
        Universite universite = universiteService.affecterFoyerAUniversite(idUniversite, nomFoyer);
                return  universite;
    }
    @PutMapping ("/desaffecterFoyerAUniversite/{idUniversite}")
    @ResponseBody
    public Universite desaffecterFoyerAUniversite (@PathVariable("idUniversite") Long idUniversite){
    Universite universite = universiteService.desaffecterFoyerAUniversite(idUniversite);
     return universite;
}
}
