package ferrovie;

public class TAV extends Treno
{
    private int k;

    public TAV(double k) { this.k = 0; }
    public TAV(int k) { this(5.0); this.k = k; }

    @Override
    public void entraInStazione()
    {
        this.frena();
        setPorte(true);
    }

    public int getK()
    {
        return k;
    }
}
