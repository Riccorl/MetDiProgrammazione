package observer;

import java.util.ArrayList;
import java.util.List;

public class AnalizzatoreStatistiche extends Analizzatore
{
    private List<Transazione> transazioni = new ArrayList<>();

    @Override
    public void analizza(Transazione t)
    {
        transazioni.add(t);
    }
}
