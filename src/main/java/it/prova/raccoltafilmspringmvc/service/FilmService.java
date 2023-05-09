package it.prova.raccoltafilmspringmvc.service;

import java.util.List;

import it.prova.raccoltafilmspringmvc.model.Film;

public interface FilmService {
	public List<Film> listAllElements();
	
	public List<Film> listaFilmDiUnRegista(Long id);

	public Film caricaSingoloElemento(Long id);
	
	public Film caricaSingoloElementoEager(Long id);

	public void aggiorna(Film filmInstance);

	public void inserisciNuovo(Film filmInstance);

	public void rimuovi(Long idFilmToDelete);

	public List<Film> findByExample(Film example);

}
