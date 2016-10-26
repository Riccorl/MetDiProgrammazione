package ferrovie;

public abstract class Treno
{
    protected int velocita;
    protected boolean porteAperte;

    public Treno(){}
    public Treno(int velocita, boolean porteAperte)
    {
        this.velocita = velocita;
        this.porteAperte = porteAperte;
    }

    public void frena()
    {
        velocita = 0;
    }

    public void entraInStazione()
    {
        this.frena();
    }

    public void setPorte(boolean b)
    {
        porteAperte = b;
    }


}
