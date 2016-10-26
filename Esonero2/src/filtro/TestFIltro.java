package filtro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFIltro
{
    public static void main(String[] args)
    {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 1, 4, 5, 2));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(1, 2, 7, 1, 1, 4, 5));

        FiltroIntero filtroInt = new FiltroIntero(1);

        try
        {
            System.out.println(filtroInt.filtra());
        } catch (Filtro.NessunaLista nessunaLista)
        {
            System.out.println("Lista vuota!");
        }

        FiltroPrimo filtroPrimo = new FiltroPrimo(lista);

        try
        {
            System.out.println(filtroPrimo.filtra());
        } catch (Filtro.NessunaLista nessunaLista)
        {
            System.out.println("Lista vuota!");
        }

        System.out.println(filtroPrimo.filtra(lista2));

        List<Integer> lista3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        FiltroDispari filtroDispari = new FiltroDispari(lista3);

        try
        {
            System.out.println(filtroDispari.filtra());
        } catch (Filtro.NessunaLista nessunaLista)
        {
            System.out.println("Lista vuota!");
        }

        System.out.println(filtroDispari.filtra(lista3));

        List<Filtro> filtri = new ArrayList<>(Arrays.asList(
                new FiltroIntero(1),
                new FiltroPrimo(),
                new FiltroDispari()));

        MultiFiltro multiFiltro = new MultiFiltro(lista, filtri);

        try
        {
            System.out.println(multiFiltro.filtra());
        } catch (Filtro.NessunaLista nessunaLista)
        {
            System.out.println("Lista vuota!");
        }
    }
}
