package com.example.springbootproject.Reposotory;

import com.example.springbootproject.entite.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends JpaRepository <Universite, Long> {
}
