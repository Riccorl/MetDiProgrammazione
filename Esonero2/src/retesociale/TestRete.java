package retesociale;

import java.util.ArrayList;
import java.util.Arrays;

public class TestRete
{
    public static void main(String[] args)
    {
        Utente dio = new Utente("Dio", "Bove", Utente.Visibilità.TUTTI);
        Utente gesu = new Utente("Gesù", "Bambino", Utente.Visibilità.TUTTI);
        Utente cane = new Utente("Cane", "Pane", Utente.Visibilità.AMICI);

        ReteSociale feisbuc = new ReteSociale();

        feisbuc.aggiungiUtente(dio);
        feisbuc.aggiungiUtente(gesu);
        feisbuc.aggiungiUtente(cane);

        String utentiPerCogno = feisbuc.getUtentiPerCognome("Bove");


        dio.richiediAmicizia(gesu);
        System.out.println(gesu.toStringAmici());


        System.out.println(gesu.getRichiesteDiAmicizia());
        try
        {
            gesu.accettaAmicizia(dio);
        } catch (Utente.AmiciziaNonRichiestaException e)
        {
            System.out.println("Non è amico tuo");
        }

        System.out.println(gesu.toStringAmici());



    }
}
