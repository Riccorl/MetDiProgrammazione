package filtro;

import java.util.ArrayList;
import java.util.List;

public class MultiFiltro extends Filtro
{
    private List<Filtro> filtri;

    public MultiFiltro(List<Filtro> filtri)
    {
        this.filtri = filtri;
    }

    public MultiFiltro(List<Integer> l, List<Filtro> filtri)
    {
        super(l);
        this.filtri = filtri;
    }

    @Override
    public List<Integer> filtra() throws NessunaLista
    {
        if (l == null) throw new NessunaLista();
        return filtra(this.l);
    }

    @Override
    public List<Integer> filtra(List<Integer> l)
    {
        List<Integer> lFiltrato = new ArrayList<>(l);
            for (Filtro f : filtri)
                lFiltrato = f.filtra(lFiltrato);

        return lFiltrato;
    }


}
