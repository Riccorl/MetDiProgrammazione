package pila;

import java.util.ArrayList;
import java.util.List;

public class Pila<T>
{
    private List<Elemento> lista;

    private class Elemento
    {
        private T val;

        public Elemento(T val)
        {
            this.val = val;
        }
    }

    public Pila()
    {
        lista = new ArrayList<>();
    }

    public void push(T e)
    {
        lista.add(new Elemento(e));
    }

    public T pop()
    {
        T daEliminare = peek();
        lista.remove(lista.size()-1);
        return daEliminare;
    }

    public T peek()
    {
        return lista.get(lista.size()-1).val;
    }

    public boolean isEmpty()
    {
        return lista.isEmpty();
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Elemento e : lista)
        {
            sb.append(e.val)
                .append(", ");
        }

        return sb.toString();
    }
}
