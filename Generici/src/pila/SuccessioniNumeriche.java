package pila;

import java.util.ArrayList;
import java.util.List;

public class SuccessioniNumeriche
{
    private List<SuccessioniNumeriche> successioni;

    private List<? super Number> succ;
    private String nome;

    private SuccessioniNumeriche(String nome, List<? super Number> succ)
    {
        this.nome = nome;
        this.succ = succ;
    }

    public void addSuccessione(String nome, List<? super Number> successione)
    {
        successioni.add(new SuccessioniNumeriche(nome, successione));
    }

    public List<? super Number> getSuccessione(String nome)
    {
        List<? super Number> succ = new ArrayList<>();
        for (SuccessioniNumeriche s : successioni)
            if (s.getNome().equals(nome)) succ = s.getSucc();

        return succ;
    }

    public List<? super Number> getSucc()
    {
        return succ;
    }

    public String getNome()
    {
        return nome;
    }
}
