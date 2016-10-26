package oca;

public class CasellaPunti implements Casella
{
    private int n;

    public CasellaPunti(int n)
    {
        this.n = n;
    }

    @Override
    public void esegui(Giocatore g)
    {
        g.setPunti(g.getPunti() + n);
    }
}
