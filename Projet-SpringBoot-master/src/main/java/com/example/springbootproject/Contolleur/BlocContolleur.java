package com.example.springbootproject.Contolleur;

import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.service.BlocService;
import com.example.springbootproject.service.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Bloc")


public class BlocContolleur //implements IBlocService {

   { IBlocService blocService;
    //http://localhost:8089/foyer/bloc/retrieve-all-Blocs
   @GetMapping("/retrieve-all-Blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs= blocService.retrieveAllBlocs();
        return listBlocs;
    }
    @GetMapping ("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable ("bloc-id") Long blocId ) {
       return blocService.retrieveBloc(blocId);
    }

       //http://localhost:8089/foyer/bloc/retrieve-all-Blocs
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
}
