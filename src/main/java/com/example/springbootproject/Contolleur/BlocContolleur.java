package com.example.springbootproject.Contolleur;

import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Foyer;
import com.example.springbootproject.service.BlocService;
import com.example.springbootproject.service.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Bloc")


public class BlocContolleur

   { IBlocService blocService;
    //http://localhost:8089/Bloc/retrieve-all-Blocs
   @GetMapping("/retrieve-all-Blocs")
    public List<Bloc> getBloc() {
        List<Bloc> listBlocs= blocService.retrieveAllBlocs();
        return listBlocs;
    }
    @GetMapping ("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable ("bloc-id") Long blocId ) {
       return blocService.retrieveBloc(blocId);
    }

       //http://localhost:8089/Bloc//retrieve-bloc/{bloc-id}
       @PostMapping ("/add-bloc")
       public Bloc addBloc (@RequestBody Bloc b) {
       Bloc bloc = blocService.addBloc(b);
       return bloc; }

       @DeleteMapping ("/remove-bloc/{bloc-id}")
       public void removeBloc(@PathVariable ("bloc-id") Long blocId) {
           blocService.removeBloc(blocId); }


       @PutMapping ("/update-bloc")
       public   Bloc updateBloc(@RequestBody Bloc b){
       Bloc bloc = blocService.updateBloc(b);
       return bloc; }
       //http://localhost:8089/foyer/bloc/retrieve-all-Blocs
       @PutMapping ( "/affecterChambresABloc{bloc-id}")
       @ResponseBody
       public Bloc affecterChambresABloc(@RequestParam List<Long> numChambre, @RequestParam String nomBloc) {
       Bloc bloc = affecterChambresABloc( numChambre, nomBloc);
       return bloc;
       }

   }
