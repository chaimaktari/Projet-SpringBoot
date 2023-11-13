package com.example.springbootproject.Reposotory;

import com.example.springbootproject.entite.Bloc;
import com.example.springbootproject.entite.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends CrudRepository<Foyer, Long> {
    Foyer findByNomFoyer(String nomFoyer);

}
