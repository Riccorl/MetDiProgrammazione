package assembly;

import java.util.List;

public class Procedura implements Istruzione
{
    private List<Istruzione> istruzioni;

    public Procedura(List<Istruzione> istruzioni)
    {
        this.istruzioni = istruzioni;
    }

    public List<Istruzione> getIstruzioni()
    {
        return istruzioni;
    }

    @Override
    public void esegui()
    {
        for (Istruzione i : istruzioni)
            i.esegui();
    }
}
