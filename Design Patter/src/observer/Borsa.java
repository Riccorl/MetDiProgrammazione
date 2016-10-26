package observer;

import java.util.ArrayList;

public class Borsa implements Subject
{
    private ArrayList<Osservatore> osservatori = new ArrayList<>();

    @Override
    public void addObserver(Osservatore o)
    {
        this.osservatori.add(o);
    }

    @Override
    public void removeObserver(Osservatore o)
    {
        this.osservatori.remove(o);
    }

    @Override
    public void updateCose(Transazione t)
    {
        for (Osservatore o : osservatori) o.update(t);
    }
}
