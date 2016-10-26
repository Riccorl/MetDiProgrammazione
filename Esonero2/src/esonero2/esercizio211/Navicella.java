package esonero2.esercizio211;

public class Navicella
{
    private boolean bLaser;
    private int pX;
    private int pY = 2;

    @Override
    public String toString()
    {
        return "N";
    }

    public void su()
    {
        pY-=1;
    }

    public void giu(Sparatutto s)
    {
        pY+=1;
    }

    public boolean getBLaser()
    {
        return bLaser;
    }

    public void setBLaser(boolean b)
    {
        bLaser = b;
    }

    public int getpX()
    {
        return pX;
    }

    public int getpY()
    {
        return pY;
    }
}

/* Salve Professore, ho una domanda sull' esercizio della navicella (2.1.1). Non riesco a
spostare la navicella all' interno del tabellone. Ho fatto un paio di tentativi ma non ha
funzionato. Qualche consiglio?
 */