package com.example.springbootproject.Contolleur;

import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Foyer;
import com.example.springbootproject.service.FoyerService;
import com.example.springbootproject.service.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping ("/Foyer")
public class FoyerControlleur {
    IFoyerService foyerService;
    //http://localhost:8089/foyer/bloc/retrieve-all-Blocs
    @GetMapping("/retrieve-all-Foyer")
    public List<Foyer> getFoyer() {
        List<Foyer> listFoyer= foyerService.retrievieAllFoyer();
        return listFoyer;
    }
    @GetMapping ("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long foyerId ) {
        return foyerService.retrieveFoyer(foyerId);
    }

    //http://localhost:8089/foyer/bloc/retrieve-all-Blocs
    @PostMapping("/add-foyer")
    public Foyer addFoyer (@RequestBody Foyer f) {
        Foyer foyer = foyerService.addFoyer(f);
        return foyer; }

    @DeleteMapping ("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable ("foyer-id") Long foyerId) {
        foyerService.removeFoyer(foyerId); }

    @PutMapping ("/update-foyer")
    public   Foyer updateFoyer(@RequestBody Foyer f){
        Foyer foyer = foyerService.updateFoyer(f);
        return foyer; }
/*
    @PostMapping("/add-foyerWithBloc")
    public Foyer addFoyerWithBloc (@RequestBody Foyer f) {
        Foyer foyer = IFoyerService.addFoyerWithBloc(f);
        return foyer;
    }*/
}
