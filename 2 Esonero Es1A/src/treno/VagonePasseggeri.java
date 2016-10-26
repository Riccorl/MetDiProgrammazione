package treno;

public class VagonePasseggeri extends Vagone
{
    private static final int CAPIENZA = 50;
    private final static String TIPO = "Vagone Passeggeri";

    public VagonePasseggeri()
    {
        super(CAPIENZA);
        this.tipo = TIPO;
    }
}
