package esonero2.esercizio238;

public interface Estraibile
{
    public class CodaVuota extends Exception{}
    Object estrai() throws CodaVuota;
}
