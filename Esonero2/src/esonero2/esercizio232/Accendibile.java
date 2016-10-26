package esonero2.esercizio232;

public interface Accendibile
{
    class DispositivoAcceso extends Exception{}
    class DispositivoSpento extends Exception{}

    void accendi() throws DispositivoAcceso;
    void spegni() throws DispositivoSpento;
}
