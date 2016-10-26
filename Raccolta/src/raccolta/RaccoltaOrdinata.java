package raccolta;

import java.util.Set;
import java.util.TreeSet;

public class RaccoltaOrdinata
{
    private Set<Canzone> canzoni;

    public RaccoltaOrdinata(Set<Canzone> canzoni)
    {
        this.canzoni = new TreeSet<>(canzoni);
    }

    @Override
    public String toString()
    {
        return canzoni.toString();
    }
}
