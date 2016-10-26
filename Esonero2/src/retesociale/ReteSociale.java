package retesociale;

import java.util.ArrayList;

public class ReteSociale
{
    private ArrayList<Utente> utenti;

    public ReteSociale()
    {
        utenti = new ArrayList<>();
    }

    public void aggiungiUtente(Utente u)
    {
        utenti.add(u);
    }

    public String getUtentiPerCognome(String cognome)
    {
        StringBuilder listaUtenti = new StringBuilder();
        for (Utente u : utenti)
        {
            if (u.getCognome().equals(cognome)) {
                listaUtenti.append(u.getNome()).append(" ").append(u.getCognome());
                if (utenti.indexOf(u) < utenti.size()) listaUtenti.append(", ");
            }
        }

        return listaUtenti.toString();
    }

    public ArrayList<Utente> getUtenti()
    {
        return utenti;
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Utente u : utenti)
        {
            sb.append(u.getNome()).append(u.getCognome());
            if (utenti.indexOf(u) < utenti.size()) sb.append(", ");
        }

        return sb.toString();
    }
}
