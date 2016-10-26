package oca;

import java.util.List;
import java.util.Random;

public class Tabellone
{
    private Casella[] caselle;
    private List<Giocatore> giocatori;

    public Tabellone(int n, List<Giocatore> giocatori)
    {
        this.giocatori = giocatori;
        caselle = new Casella[n];

        Random random = new Random();
        for (int i = 0; i < n; i++)
        {
            if (i % 9 == 0 && i != 0)
                caselle[i] = new CasellaSpostaGiocatore(random.nextInt(n/5)-n/10);
            else if (i % 4 == 0 && i != 0)
                caselle[i] = new CasellaPunti(random.nextInt(3) + 1);
            else caselle[i] = new CasellaVuota();
        }
    }

    public void spostaGiocatore(Giocatore g)
    {
        int n = g.tiraDadi();
        // System.out.println("Dado: " + n + "// ");
        g.setPosizione(g.getPosizione() + n);
        controlloPos(g);

        caselle[g.getPosizione()].esegui(g);
        controlloPos(g);
    }

    private void controlloPos(Giocatore g)
    {
        if (g.getPosizione() >= caselle.length)
            g.setPosizione(g.getPosizione() - (caselle.length));
        if (g.getPosizione() < 0)
            g.setPosizione(0);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Casella c : caselle)
            sb.append(c.getClass().getSimpleName()).append(", ");

        return sb.toString();
    }
}
