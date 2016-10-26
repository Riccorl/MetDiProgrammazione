package esonero2.esercizio236;

import java.util.ArrayList;

public class Frase implements Totalizzabile
{
    ArrayList<String> l;

    public Frase(ArrayList<String> l)
    {
        this.l = new ArrayList<String>(l);
    }

    @Override
    public int getTotale()
    {
        int tot = 0;
        for (String s : l)
            tot += Integer.parseInt(s);

        return tot;
    }
}
