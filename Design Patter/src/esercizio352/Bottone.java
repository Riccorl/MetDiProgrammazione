package esercizio352;

import java.util.ArrayList;
import java.util.List;

public class Bottone implements Subject
{
    private List<Observer> observers = new ArrayList<>();

    public void premuto()
    {
        notifyOsservatore();
    }

    @Override
    public void addOsservatore(Observer o)
    {
        observers.add(o);
    }

    @Override
    public void removeOsservatore(Observer o)
    {
        observers.remove(o);
    }

    @Override
    public void notifyOsservatore()
    {
        for (Observer o : observers) o.update();
    }

    public void setObservers(List<Observer> observers)
    {
        this.observers = observers;
    }
}
