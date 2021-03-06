package it.objectmethod.e.commerce.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.e.commerce.entity.Articolo;

@Repository
public interface ArticoloRepository extends JpaRepository<Articolo, Integer> {

	@Query("select c from Articolo c where (''=?1 or c.nomeArticolo=?1) and (''=?2 or c.codiceArticolo = ?2)")
	public ArrayList<Articolo> trovaArticoli(String name, String codiceArticolo);
}