package esercizio352;

public interface Subject
{
    void addOsservatore(Observer o);
    void removeOsservatore(Observer o);
    void notifyOsservatore();
}
