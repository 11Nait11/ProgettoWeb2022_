package it.unical.mat.progettoweb2022_.persistenza.dao.postgres;

import it.unical.mat.progettoweb2022_.model.Utente;
import it.unical.mat.progettoweb2022_.persistenza.dao.UtenteDao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UtenteDaoPostgres implements UtenteDao {
    Connection conn;
    public UtenteDaoPostgres(Connection conn) {
        this.conn = conn;
    }

//prova
    @Override
    public List<Utente> findAll() {
        List<Utente> utenti = new ArrayList<Utente>();
        String query = "select * from utenti";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Utente utente = new Utente();
                utente.setId(rs.getInt("id"));
                utente.setName(rs.getString("name"));
                utente.setLastname(rs.getString("lastname"));
                utente.setAge(rs.getInt("age"));
                utente.setNickname(rs.getString("nickname"));
                utente.setPassword(rs.getString("password"));
                utente.setPassword(rs.getString("email"));
                utente.setRole(rs.getString("role"));
                utente.setIsbanned(rs.getBoolean("isbanned"));

                utenti.add(utente);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return utenti;
    }

    @Override
    public Utente findByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public void saveOrUpdate(Utente utente) {

    }

    @Override
    public void delete(Utente utente) {

    }
}
