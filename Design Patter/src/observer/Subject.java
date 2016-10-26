package observer;

public interface Subject
{
    void addObserver(Osservatore o);
    void removeObserver(Osservatore o);
    void updateCose(Transazione t);
}
