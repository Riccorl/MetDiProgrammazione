package observer;

abstract public class Analizzatore implements Osservatore
{
    abstract public void analizza(Transazione t);

    @Override
    public void update(Transazione t)
    {
        analizza(t);
    }
}
