package filtro;

import java.util.ArrayList;
import java.util.List;

public class FiltroPrimo extends Filtro
{
    public FiltroPrimo() {}

    public FiltroPrimo(List<Integer> l)
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
        for (int i : l)
            if (i != l.get(0)) lFiltrato.add(i);

        return lFiltrato;
    }
}
