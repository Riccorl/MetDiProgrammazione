package esonero2.esercizio236;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTot
{
    public static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1,1,1,1));
        SequenzaInteri s = new SequenzaInteri(lista);

        System.out.println(s.getTotale());

        ArrayList<String> lista2 = new ArrayList<>(Arrays.asList("lansdsjad","1","1"));
        Frase f = new Frase(lista2);

        System.out.println(f.getTotale());
    }
}
