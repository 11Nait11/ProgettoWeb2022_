package it.unical.mat.progettoweb2022_.persistenza.dao;

import it.unical.mat.progettoweb2022_.model.Utente;

import java.util.List;

public interface UtenteDao {
    public List<Utente> findAll();

    public Utente findByPrimaryKey(Integer id);

    public void saveOrUpdate(Utente utente);

    public void delete(Utente utente);
}
