package es341;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ristorante
{
    private String nome;
    private TipoRistorante tipo;
    private int coperti;

    public enum TipoRistorante
    {
        PIZZERIA,
        RISTO,
        BISTRO,
        VEGETARIANO
    }

    public Ristorante(String nome, TipoRistorante tipo, int coperti)
    {
        this.nome = nome;
        this.coperti = coperti;
        this.tipo = tipo;
    }

    public String getNome()
    {
        return nome;
    }

    public TipoRistorante getTipo()
    {
        return tipo;
    }

    public int getCoperti()
    {
        return coperti;
    }

    @Override
    public String toString()
    {
        return nome + ": " + tipo + ": " + coperti;
    }

    //Esercizio 3.4.6. Data la lista di ristoranti fornita sopra, scrivere un metodo che
    // restituisca l’insieme dei ristoranti che hanno almeno 45 coperti.
    static public Set<Ristorante> es346(List<Ristorante> risto)
    {
        return risto.stream().filter( r -> r.getCoperti() >= 45 ).collect(Collectors.toSet());
    }

    // Esercizio 3.4.7. Data la lista di ristoranti fornita sopra, scrivere un metodo che
    // restituisca una mappa tipo di ristorante → lista dei ristoranti di quel tipo
    // (nella versione Java 8 si utilizzi per la mappatura un riferimento a metodo).
    static public Map<TipoRistorante, List<Ristorante>> es347(List<Ristorante> risto)
    {
        return risto.stream().collect(Collectors.groupingBy(Ristorante::getTipo));
    }

    // Esercizio 3.4.8. Come nell’esercizio precedente, ma con ciascuna lista di
    // ristoranti ordinata per numero di coperti.
    static public Map<TipoRistorante, List<Ristorante>> es348(List<Ristorante> risto)
    {
        return risto.stream().sorted(Comparator.comparing(Ristorante::getCoperti)).collect(Collectors.groupingBy(Ristorante::getTipo));
    }

    // Esercizio 3.4.9. Data la lista di ristoranti fornita sopra, scrivere un metodo che
    // stampi i nomi dei ristoranti in ordine alfabetico separati da virgola.
    static public void es349(List<Ristorante> risto)
    {
        System.out.println(risto.stream().map(Ristorante::getNome).sorted().collect(Collectors.joining(", ")));
    }

    // Esercizio 3.4.10. Data la lista di ristoranti fornita sopra, scrivere un metodo che
    // restituisca la somma totale di tutti i coperti dei ristoranti nella lista.
    static public int es3410(List<Ristorante> risto)
    {
        return risto.stream().map(Ristorante::getCoperti).reduce(0, Integer::sum);
    }


    public static void main(String[] args)
    {
        List<Ristorante> risto = Arrays.asList(
                new Ristorante("La pergola", TipoRistorante.RISTO, 55),
                new Ristorante("L’etico", TipoRistorante.PIZZERIA, 25),
                new Ristorante("Da Rossi", TipoRistorante.RISTO, 47),
                new Ristorante("Da Gigi", TipoRistorante.PIZZERIA, 42),
                new Ristorante("Giggetto", TipoRistorante.PIZZERIA, 80),
                new Ristorante("Da Ivo", TipoRistorante.PIZZERIA, 150),
                new Ristorante("Romolo e Luigi", TipoRistorante.PIZZERIA, 50),
                new Ristorante("La terrazza", TipoRistorante.RISTO, 40)
        );

        /*
        risto.stream()
                .sorted(Comparator.comparing(Ristorante::getCoperti).reversed())
                .forEach(s -> System.out.println(s.getNome() + ": " + s.getCoperti()));
        */

        // System.out.println(es346(risto));
        System.out.println(es347(risto));
        System.out.println();
        System.out.println(es348(risto));
        System.out.println();
        es349(risto);
        System.out.println();
        System.out.println(es3410(risto));

        // Esercizio 3.4.11. Scrivere un metodo che stampi
        // i primi 10000 interi (per la versione Java 8 si utilizzi IntStream.rangeClosed oppure Stream.iterate).
        IntStream.rangeClosed(0, 10000).forEach(System.out::println);

    }

}
