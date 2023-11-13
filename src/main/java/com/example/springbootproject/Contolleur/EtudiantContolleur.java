package com.example.springbootproject.Contolleur;

import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Etudiant;
import com.example.springbootproject.service.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")

public class EtudiantContolleur {
    IEtudiantService etudiantService;


    // http://localhost:8089/foyer/etudiants/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiant")
    public List<Etudiant> getEtudiant() {
        List<Etudiant> listEtudiant = etudiantService.retrieveAllEtudiants();
        return listEtudiant;
    }

    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }

    //http://localhost:8089/foyer/bloc/retrieve-all-Blocs
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }

    @DeleteMapping("/remove-etudiant/{etudiants-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        etudiantService.retrieveEtudiant(etudiantId);
    }

    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.updateEtudiant(e);
        return etudiant;
    }


    @PutMapping("/affecterEtudiantAReservation/{nomEt}/{prenomEt}")
    public Etudiant affecterEtudiantAReservation(
            @PathVariable("nomEt") String nomEt,
            @PathVariable("prenomEt") String prenomEt,
            @RequestParam("idReservation") String idReservation) {
        return etudiantService.affecterEtudiantAReservation(nomEt, prenomEt, idReservation);

    }
}


