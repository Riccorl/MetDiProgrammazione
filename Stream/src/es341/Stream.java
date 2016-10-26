package es341;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream
{
    /**
     * Esercizio 3 esonero 4 2015
     * @param lista
     * @return
     */
    public List<String> int2stringList(List<Integer> lista)
    {
        return lista.stream()
                    .filter(x -> x % 2 != 0)
                    .limit(5)
                    .map(x -> x.toString())
                    .collect(Collectors.toList());
    }

    /**
     * Esercizio 2 Esonero 4 2015
     * @param lista
     * @return
     */
    public Map<String, Integer> string2map(List<String> lista)
    {
        // Java 8
        /*
        return lista.stream()
                    .collect(Collectors.toMap(
                            s -> "'" + s + "'",
                            s -> s.length() +2,
                            (s1, s2) -> s1
                    ));
        */

        // Java 7
        Map<String, Integer> mappa = new HashMap<>();
        for (String s : lista)
            mappa.put("'" + s + "'", s.length()+2);

        return mappa;
    }

    /**
     * Esercizio 3.4.1
     * @param lista
     * @return
     */
    public List<String> es341(List<String> lista)
    {
        return lista.stream()
                    .filter(s -> s.length() >= 4 && s.chars().distinct().count() >= 2)
                    .limit(3)
                    .collect(Collectors.toList());
    }

    /**
     * Esercizio 3.4.2
     * @param lista
     */
    public Set<Integer> es342(List<String> lista)
    {
        return lista.stream()
                    .map(String::length)
                    .collect(Collectors.toSet());
    }

    /**
     * Esercizio 3.4.3
     * @param lista
     * @return
     */
    public Set<Integer> es343(List<String> lista)
    {
        return lista.stream()
                .map(String::length)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    /**
     * Esercizio 3.4.4
     * @param lista
     * @return
     */
    public Map<Integer, List<String>> es344(List<String> lista)
    {
        return lista.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
    }

    /**
     * Esercizio 3.2.6
     * @param lista
     * @param <T>
     */
    public <T> void freq(List<T> lista)
    {
        lista.stream().sorted().distinct().forEach( s -> System.out.println(
                s + " " + lista.stream().filter(s2 -> s2.equals(s)).count()
        ));

    }


    public static void main(String[] args)
    {
        Stream stream = new Stream();

        List<String> s = new ArrayList<>(Arrays.asList(
                "ciao",
                "ciao 2",
                "ciao 3144444",
                "ciao 333"
        ));

        stream.freq(Arrays.asList("oh", "capitano", "mio", "capitano"));

        System.out.println(stream.string2map(Arrays.asList(
                "esploratori e pionieri, non guardiani non".split(" "))));

        List<Integer> interi = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    }
}
