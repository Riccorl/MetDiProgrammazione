package treno;

public class Locomotiva extends Vagone
{
    private final static int CAPIENZA = 0;
    private final static String TIPO = "Locomotiva";

    public Locomotiva()
    {
        super(CAPIENZA);
        this.tipo = TIPO;
    }
}
