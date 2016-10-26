package esonero2.esercizio235;

public class Contatore implements Resettabile
{
    private int counter;

    public void conta()
    {
        counter++;
    }

    @Override
    public void reset()
    {
        counter = 0;
    }

    public int getCounter()
    {
        return counter;
    }

}
