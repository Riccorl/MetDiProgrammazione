package treno;

/**
 * Created by Ric on 04/04/16.
 */
public class VagoneMerci extends Vagone
{
    private final static int CAPIENZA = 0;
    private final static String TIPO = "Vagone Merci";

    public VagoneMerci()
    {
        super(CAPIENZA);
        this.tipo = TIPO;
    }
}
