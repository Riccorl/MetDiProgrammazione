package esonero2.esercizio238;

public interface Aggiungibile
{
    class DiversoTipo extends Exception{}

    void aggiungi(Object o) throws DiversoTipo;
}
