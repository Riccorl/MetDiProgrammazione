package filtro;

import java.util.ArrayList;
import java.util.List;

public class FiltroDispari extends Filtro
{
    public FiltroDispari() {}

    public FiltroDispari(List<Integer> l)
    {
        super(l);
    }

    @Override
    public List<Integer> filtra()throws NessunaLista
    {
        if (l == null) throw new NessunaLista();
        return filtra(l);
    }

    @Override
    public List<Integer> filtra(List<Integer> l)
    {
        List<Integer> lFiltrato = new ArrayList<>();
        for (int i = 0; i < l.size(); i++)
            if (i % 2 == 0) lFiltrato.add(l.get(i));

        return lFiltrato;
    }
}
