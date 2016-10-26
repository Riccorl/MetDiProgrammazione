package raccolta;

import java.util.HashSet;
import java.util.Set;

public class Raccolta
{
    private Set<Canzone> canzoni;

    public Raccolta(Set<Canzone> canzoni)
    {
        this.canzoni = new HashSet<>(canzoni);
    }

    @Override
    public String toString()
    {
        return canzoni.toString();
    }
}