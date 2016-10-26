package pila;

import java.util.ArrayList;
import java.util.List;

public class SuccessioniNum2
{
    private List<Sequenza> sequenze = new ArrayList<>();

    public void addSuccessione(String nome, List<? extends Number> seq)
    {
        sequenze.add(new Sequenza(nome, seq));
    }

    public List<?> getSuccessione(String nome)
    {
        List<?> seq = new ArrayList<>();
        for (Sequenza s : sequenze)
            if (nome.equals(s.getNome()))
                seq = s.getSequenza();

        return seq;
    }

    private class Sequenza
    {
        private String nome;
        private List<? extends Number> sequenza;

        public Sequenza(String nome, List<? extends Number> sequenza)
        {
            this.nome = nome;
            this.sequenza = sequenza;
        }

        public String getNome()
        {
            return nome;
        }

        public List<?> getSequenza()
        {
            return sequenza;
        }
    }
}
