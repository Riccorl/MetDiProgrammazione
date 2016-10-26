package oca;

public class Giocatore
{
    private int posizione;
    private int punti;

    public int tiraDadi()
    {
        return (int) (Math.random()*5 + 1);
    }

    public int getPosizione()
    {
        return posizione;
    }

    public void setPosizione(int posizione)
    {
        this.posizione = posizione;
    }

    public int getPunti()
    {
        return punti;
    }

    public void setPunti(int punti)
    {
        this.punti = punti;
    }
}
