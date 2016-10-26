package esonero2.esercizio232;

public class Telecomando implements Accendibile
{
    private Dispositivo d;

    public Telecomando(Dispositivo d)
    {
        this.d = d;
    }

    @Override
    public void accendi() throws DispositivoAcceso
    {
        d.accendi();
    }

    @Override
    public void spegni() throws DispositivoSpento
    {
        d.spegni();
    }
}
