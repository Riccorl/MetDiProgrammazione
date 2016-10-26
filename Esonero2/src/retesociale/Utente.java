package retesociale;

import java.util.ArrayList;
import java.util.List;

public class Utente
{
    public enum Visibilità { TUTTI, AMICI; }

    public class AmiciziaNonRichiestaException extends Exception{}
    public class AmiciNonVisibiliException extends Exception{}

    private String nome;
    private String cognome;
    protected ArrayList<Utente> amici;
    protected ArrayList<Utente> richieste;
    private Visibilità visibilità;

    public Utente(String nome, String cognome, Visibilità visibilità)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.visibilità = visibilità;
        amici = new ArrayList<>();
        richieste = new ArrayList<>();

    }

    public void richiediAmicizia(Utente u)
    {
        u.richieste.add(this);
    }

    public void accettaAmicizia(Utente u) throws AmiciziaNonRichiestaException
    {
        if (!richieste.contains(u)) throw new AmiciziaNonRichiestaException();
        amici.add(u);
        ArrayList<Utente> richiesteNuovo = new ArrayList<>();
        for (Utente utente : richieste)
            if (!utente.equals(u)) richiesteNuovo.add(utente);

        richieste = richiesteNuovo;
    }

    public String getAmiciDi(Utente u) throws AmiciNonVisibiliException
    {
        if (u.visibilità == Visibilità.AMICI && !u.getAmici().contains(this)) throw new AmiciNonVisibiliException();
        return u.getAmici().toString();
    }

    public String getRichiesteDiAmicizia()
    {
        String s = "";
        for (Utente utente : richieste)
            s += utente.getNome()+" " + utente.getCognome() + ", ";

        return s;
    }

    public String toStringAmici()
    {
        String s = "";
        for (Utente utente : amici)
            s += utente.getNome()+" " + utente.getCognome() + ", ";

        return s;
    }

    public List<Utente> getRichieste()
    {
        return richieste;
    }

    public String getNome()
    {
        return nome;
    }

    public String getCognome()
    {
        return cognome;
    }

    public List<Utente> getAmici()
    {
        return amici;
    }

    public Visibilità getVisibilità()
    {
        return visibilità;
    }

    public void setVisibilità(Visibilità visibilità)
    {
        this.visibilità = visibilità;
    }
}
