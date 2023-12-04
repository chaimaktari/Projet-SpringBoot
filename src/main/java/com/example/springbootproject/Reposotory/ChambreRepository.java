package com.example.springbootproject.Reposotory;

import com.example.springbootproject.entite.Chambre;
import com.example.springbootproject.entite.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
 Chambre findByNumeroChambre(Long numeroChambre);
    List<Chambre> findByTypeCAndBlocIdBloc(TypeChambre type, long idBloc);

   // @Query(" select count (c) form chambre c where c.typeC=: type ")
}
