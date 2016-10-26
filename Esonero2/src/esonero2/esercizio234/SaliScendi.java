package esonero2.esercizio234;

public interface SaliScendi
{
    class NessunCambio extends Exception{}

    void sali() throws NessunCambio;
    void scendi() throws NessunCambio;
}
