package esonero2.esercizio232;

public class TestAcc
{
    public static void main(String[] args)
    {
        Dispositivo d = new Dispositivo("Ciao", "Bella");
        Telecomando t = new Telecomando(d);

        try
        {
            d.accendi();
        } catch (Dispositivo.DispositivoAcceso dispositivoAcceso)
        {
            dispositivoAcceso.printStackTrace();
        }

        try
        {
            d.spegni();
        } catch (Accendibile.DispositivoSpento dispositivoSpento)
        {
            dispositivoSpento.printStackTrace();
        }

        try
        {
            t.accendi();
        } catch (Accendibile.DispositivoAcceso dispositivoAcceso)
        {
            dispositivoAcceso.printStackTrace();
        }

        System.out.print(d.isAcceso());

    }
}
