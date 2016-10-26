package listalinkata;

public class ListaTest
{
    public static void main(String[] args)
    {
        ListaLinkata<Integer> listaInteri = new ListaLinkata<>();

        for (int i = 0; i < 10; i++)
        {
            listaInteri.addPrimo(i);
        }

        System.out.println(listaInteri.toString());

        listaInteri.removePrimo();

        System.out.println(listaInteri.toString());

    }
}
