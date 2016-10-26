package dizi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDizi
{
    public static void main(String[] args)
    {
        Chiave<String> c = new Chiave<>("Cacca");
        Chiave<String> c2 = new Chiave<>("Cacca2");
        Chiave<String> c3 = new Chiave<>("Cacca3");
        Chiave<String> c4 = new Chiave<>("Cacca3");
        Chiave<String> c5 = new Chiave<>("Cacca4");
        Chiave<String> c6 = new Chiave<>("Cacca6");

        Elemento<String> e = new Elemento<>("Orcocane1");
        Elemento<String> e2 = new Elemento<>("Orcocane2");
        Elemento<String> e3 = new Elemento<>("Orcocane3");
        Elemento<String> e4 = new Elemento<>("Orcocane4");
        Elemento<String> e5 = new Elemento<>("Orcocane5");


        List<Coppia> lista = new ArrayList<>(Arrays.asList(
                new Coppia(c, e),
                new Coppia(c2, e2),
                new Coppia(c3, e3),
                new Coppia(c5, e5)
        ));

        Mappa m = new Mappa(lista);

        System.out.println(m);

        try
        {
            m.add(c, e3);
        } catch (Dizionario.ElementAlreadyContainedException e1)
        {
            e1.printStackTrace();
        }

        System.out.println(m);
    }
}
