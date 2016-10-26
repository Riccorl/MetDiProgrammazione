package treno;

import java.util.ArrayList;

public class Treno
{
    private ArrayList<Vagone> treno = new ArrayList<Vagone>();
    private Locomotiva locomotiva;
    private int index;

    public class TrenoFinito extends Exception{}

    public Treno(Locomotiva locomotiva)
    {
        this.locomotiva = locomotiva;
        treno.add(index, this.locomotiva);
    }

    public void aggiungiVagone(Vagone v)
    {
        treno.add(++index, v);
    }

    public Treno dividiTreno(int k, Locomotiva l) throws TrenoFinito
    {
        ArrayList<Vagone> nuovoTreno = new ArrayList<>();

        if (k >= treno.size()) throw new TrenoFinito();
        Treno trenoNuovo = new Treno(new Locomotiva());

        for (int i = k; i < treno.size(); i++)
            trenoNuovo.treno.add(this.treno.get(i));

        return trenoNuovo;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Vagone v : treno)
        {
            if (treno.indexOf(v) == treno.size()-1) sb.append(v.getTipo());
            else sb.append(v.getTipo()).append("--");
        }

        return sb.toString();
    }
}
