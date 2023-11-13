package com.example.springbootproject.Reposotory;

import com.example.springbootproject.entite.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
 Chambre findAllById(Long numChambre);
    }
