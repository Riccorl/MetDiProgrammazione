package oca;

import java.util.List;

public class GiocoDellOca
{
    private int n;
    private Tabellone tabellone;
    private List<Giocatore> giocatori;

    public GiocoDellOca(int n, List<Giocatore> giocatori)
    {
        this.n = n;
        this.giocatori = giocatori;
        this.tabellone = new Tabellone(n, giocatori);
    }

    public void giocaUnTurno()
    {
        for (Giocatore g : giocatori)
            tabellone.spostaGiocatore(g);
    }

    public String toStringTab()
    {
        return tabellone.toString();
    }

    public String toStringPos()
    {
        StringBuilder sb = new StringBuilder();

        for (Giocatore g : giocatori)
            sb.append(g.getPosizione()).append(", ");

        return sb.toString();
    }

    public String toStringPunti()
    {
        StringBuilder sb = new StringBuilder();

        for (Giocatore g : giocatori)
            sb.append(g.getPunti()).append(", ");

        return sb.toString();
    }
}
