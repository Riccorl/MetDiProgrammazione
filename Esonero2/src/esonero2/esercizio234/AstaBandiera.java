package esonero2.esercizio234;

public class AstaBandiera implements SaliScendi
{
    private boolean bandieraAlzata;
    private int b;

    public AstaBandiera(int b)
    {
        this.b = b;
    }

    @Override
    public void sali() throws NessunCambio
    {
        if (bandieraAlzata) throw new NessunCambio();
        bandieraAlzata = true;
    }

    @Override
    public void scendi() throws NessunCambio
    {
        if (!bandieraAlzata) throw new NessunCambio();
        bandieraAlzata = false;
    }

    public String getBandiera()
    {
        if (bandieraAlzata) return "Bandiera Alzata";
        else return null;
    }
}
