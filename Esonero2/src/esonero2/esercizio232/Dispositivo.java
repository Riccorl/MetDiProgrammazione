package esonero2.esercizio232;

public class Dispositivo implements Accendibile
{
    private boolean acceso;
    protected String benvenuto;
    protected String saluto;

    public Dispositivo(String benvenuto, String saluto)
    {
        this.benvenuto = benvenuto;
        this.saluto = saluto;
    }

    @Override
    public void accendi() throws DispositivoAcceso
    {
        if (acceso) throw new DispositivoAcceso();
        acceso = true;
        System.out.println(benvenuto);
    }

    @Override
    public void spegni() throws DispositivoSpento
    {
        if (!acceso) throw new DispositivoSpento();
        acceso = false;
        System.out.println(saluto);
    }

    public boolean isAcceso()
    {
        return acceso;
    }
}
