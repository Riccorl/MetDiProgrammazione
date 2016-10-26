package esonero2.esercizio234;

public class Ascensore implements SaliScendi
{
    private int nPiani;
    private int pianoCorrente;

    public Ascensore(int nPiani)
    {
        this.nPiani = nPiani;
    }

    @Override
    public void sali() throws NessunCambio
    {
        if (pianoCorrente == nPiani) throw new NessunCambio();
        pianoCorrente++;
    }

    @Override
    public void scendi() throws NessunCambio
    {
        if (pianoCorrente == 0) throw new NessunCambio();
        pianoCorrente--;
    }

}
