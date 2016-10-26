package sequenzagradini;

import java.util.ArrayList;
import java.util.List;

public class SequenzaGradini
{
    private List<Integer> seq;
    private class ValoreNonValido extends Exception{}

    public SequenzaGradini()
    {
        this.seq = new ArrayList<>();
    }

    public void aggiungi(int x) throws ValoreNonValido
    {
        if (x - seq.get(seq.size()-1) != 1)
        seq.add(x);
    }
}
