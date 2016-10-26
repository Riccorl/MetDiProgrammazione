package treno;

public class VagoneLetto extends Vagone
{
    private final static int CAPIENZA = 10;
    private final static String TIPO = "Vagone Letto";

    public VagoneLetto()
    {
        super(CAPIENZA);
        this.tipo = TIPO;
    }

    public void occupa(PasseggeroAssonnato p) throws VagonePieno
    {
        if (postiOccupati == capienza) throw new VagonePieno();
        postiOccupati++;
        System.out.println(p.getNome() + " registrato");
    }
}
