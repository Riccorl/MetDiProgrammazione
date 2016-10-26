package es341;

import java.text.DecimalFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Titolo
{
    public enum Allineamento { CX, SX, DX }
    private Allineamento allineamento;
    private List<Riga> righe;

    public Titolo(Allineamento a)
    {
        this(a, new ArrayList<>());
    }

    public Titolo(Allineamento a, List<Riga> righe)
    {
        allineamento = a;
        this.righe = righe;
    }

    public void add(Riga r)
    {
        righe.add(r);
    }

    public boolean isCentered()
    {
        return allineamento == Allineamento.CX;
    }

    @Override
    public String toString()
    {
        return righe.toString();
    }

    public Allineamento getAllineamento()
    {
        return allineamento;
    }

    public List<Riga> getRighe()
    {
        return new ArrayList<>(righe);
    }

    static public class Riga
    {
        private String riga;
        private int numero;

        public Riga(String riga, int numero)
        {
            this.riga = riga;
            this.numero = numero;
        }

        public Riga(String riga)
        {
            this(riga, -1);
        }

        @Override
        public String toString()
        {
            return (numero == -1 ? "" : numero+": ") + riga;
        }
    }

    public static void main(String[] args)
    {
        List<Riga> righe = Arrays.asList(
                new Riga("Valerione nazionale"),
                new Riga("Valerio gay", 1),
                new Riga("Casa", 2),
                new Riga("Cavallo", 3),
                new Riga("Dio", 3)
        );

        List<Riga> righe2 = Arrays.asList(
                new Riga("Valerio gay!", 1),
                new Riga("Gyggy", 2),
                new Riga("Lab", 3),
                new Riga("Bal", 5)
        );

        List<Riga> righe3 = Arrays.asList(
                new Riga("Valerio gay!", 1),
                new Riga("Ikea", 2)
        );

        List<Riga> righe4 = Arrays.asList(
                new Riga("Valerione canotto")
        );

        List<Titolo> titoli = Arrays.asList(
                new Titolo(Allineamento.CX, righe),
                new Titolo(Allineamento.CX, righe),
                new Titolo(Allineamento.CX, righe2),
                new Titolo(Allineamento.DX, righe2),
                new Titolo(Allineamento.DX, righe3),
                new Titolo(Allineamento.SX, righe4)
        );

        // l’insieme dei primi 5 titoli con al piu` una riga
        Set<Titolo> primi5 = titoli.stream()
                                    .filter(t -> t.getRighe().size() <= 1).limit(5).collect(toSet());

        // la lista dei soli titoli centrati e in ordine alfabetico
        List<Titolo> titoliCentratiAlfa = titoli.stream()
                .filter(Titolo::isCentered).sorted(Comparator.comparing(Titolo::toString)).collect(toList());

        System.out.println("TitoloCX: " + titoliCentratiAlfa);

        // la mappa da allineamento a lista di titoli
        Map<Allineamento, List<Titolo>> mappaAlly = titoli.stream().collect(groupingBy(Titolo::getAllineamento));
        System.out.println("Mappa Allineamento" + mappaAlly);


        // la mappa da allineamento a insieme di titoli
        Map<Allineamento, Set<Titolo>> mappaInsieme = titoli.stream().collect(groupingBy(Titolo::getAllineamento, toSet()));
        System.out.println("Mappa Insieme" + mappaInsieme);

        // la mappa da allineamento alla concatenazione delle stringhe dei titoli
        Map<Allineamento, List<String>> mappaStringhe = titoli.stream()
                .collect(groupingBy(Titolo::getAllineamento,
                        mapping(Titolo::toString, toList())));


























    }
}