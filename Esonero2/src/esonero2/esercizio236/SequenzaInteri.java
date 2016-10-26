package esonero2.esercizio236;

import java.util.ArrayList;
import java.util.List;

public class SequenzaInteri implements Totalizzabile
{
    private List<Integer> l;

    public SequenzaInteri(List<Integer> l)
    {
        this.l = new ArrayList<>(l);
    }

    @Override
    public int getTotale()
    {
        int tot = 0;
        for (int i : l) tot+=i;

        return tot;
    }
}
