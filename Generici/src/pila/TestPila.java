package pila;

import metodigenerici.MetodiGenerici;

import java.util.Arrays;
import java.util.List;

public class TestPila
{
    public static void main(String[] args)
    {
        Pila<Integer> pila = new Pila<>();

        System.out.println(pila.isEmpty());

        for (int i = 0; i < 10; i++)
        {
            pila.push(i);
        }

        System.out.println(pila.toString());

        pila.pop();
        System.out.println(pila.toString());

        System.out.println();

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(MetodiGenerici.inverti(lista));
        System.out.println(MetodiGenerici.max(lista));
    }
}
