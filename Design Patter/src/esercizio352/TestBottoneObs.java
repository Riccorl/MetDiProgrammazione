package esercizio352;

public class TestBottoneObs
{
    public static void main(String[] args)
    {
        Bottone b = new Bottone();

        for (int i = 0; i < 5; i++)
        {
            b.addOsservatore(new Esecutore());
        }

        b.premuto();
    }
}
