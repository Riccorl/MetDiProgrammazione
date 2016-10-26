package esonero2.esercizio238;

public class Test238
{
    public static void main(String[] args)
    {
        UfficioPostale up = new UfficioPostale();

        try
        {
            up.aggiungi(new Clienti("Dio"));
        } catch (Aggiungibile.DiversoTipo diversoTipo)
        {
            diversoTipo.printStackTrace();
        }

        try
        {
            up.aggiungi(new Clienti("Madonna"));
        } catch (Aggiungibile.DiversoTipo diversoTipo)
        {
            diversoTipo.printStackTrace();
        }

        System.out.println(up.toString());

        try
        {
            up.estrai();
        } catch (Estraibile.CodaVuota codaVuota)
        {
            codaVuota.printStackTrace();
        }

        System.out.println(up.toString());

        try
        {
            up.estrai();
        } catch (Estraibile.CodaVuota codaVuota)
        {
            codaVuota.printStackTrace();
        }

        try
        {
            up.estrai();
        } catch (Estraibile.CodaVuota codaVuota)
        {
            codaVuota.printStackTrace();
        }
    }
}
