package it.unical.mat.progettoweb2022_.persistenza;

import it.unical.mat.progettoweb2022_.persistenza.dao.UtenteDao;
import it.unical.mat.progettoweb2022_.persistenza.dao.postgres.UtenteDaoPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    private static DBManager instance = null;

    public static DBManager getInstance() {
        if (instance == null) {
            instance = new DBManager();
        }
        return instance;
    }

    private DBManager() {
    }

    Connection conn = null;

    public Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "postgres");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return conn;
    }

    public UtenteDao getUtenteDao() {
        return new UtenteDaoPostgres(getConnection());
    }

/*
    public RecensioneDao getRecensioneDao() {
        return new RecensioneDaoPostgres(getConnection());
    }*/
}
