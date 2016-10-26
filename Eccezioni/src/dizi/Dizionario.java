package dizi;

public interface Dizionario<T, S>
{
    Elemento<S> search(Chiave<T> k) throws ElementNotFoundException;
    void add(Chiave<T> k, Elemento<S> e) throws ElementAlreadyContainedException;
    Elemento<S> delete(Chiave<T> k) throws ElementNotFoundException;
    int size();

    class ElementNotFoundException extends Exception {}
    class ElementAlreadyContainedException extends Exception {}
}
