package com.example.springbootproject.Reposotory;

import com.example.springbootproject.entite.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends JpaRepository <Bloc, Long> {

}
