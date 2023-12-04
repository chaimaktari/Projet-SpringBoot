package com.example.springbootproject.Reposotory;

import com.example.springbootproject.entite.Reservation;
import com.example.springbootproject.entite.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UniversiteRepository extends JpaRepository <Universite, Long> {
    Universite findByNomUniversite(String nomUnv);

}

