package it.prova.raccoltafilmspringmvc.repository.film;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.prova.raccoltafilmspringmvc.model.Film;

public interface FilmRepository extends CrudRepository<Film, Long>,CustomFilmRepository {
	@Query("from Film f join fetch f.regista where f.id = ?1")
	Film findSingleFilmEager(Long id);
	
	public List<Film> findAllByRegista_id(Long id);

}
