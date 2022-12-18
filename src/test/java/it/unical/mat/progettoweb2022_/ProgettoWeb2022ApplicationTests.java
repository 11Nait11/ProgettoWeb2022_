package it.unical.mat.progettoweb2022_;

import it.unical.mat.progettoweb2022_.model.Utente;
import it.unical.mat.progettoweb2022_.persistenza.DBManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProgettoWeb2022ApplicationTests {

    @Test
    void contextLoads() {
        List<Utente> utenti =DBManager.getInstance().getUtenteDao().findAll();
        for(Utente i:utenti)
            i.stampa();
    }

}
