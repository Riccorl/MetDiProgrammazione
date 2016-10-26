package oca;

public class CasellaSpostaGiocatore implements Casella
{
    private int x;

    public CasellaSpostaGiocatore(int x)
    {
        this.x = x;
    }

    @Override
    public void esegui(Giocatore g)
    {
        g.setPosizione(g.getPosizione() + x);
    }
}
