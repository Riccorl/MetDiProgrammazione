package listalinkata;

public class ListaLinkata<T>
{
    private Elemento primo;

    private class Elemento
    {
        private T val;
        private Elemento next;

        public Elemento(T val, Elemento next)
        {
            this.val = val;
            this.next = next;
        }
    }

    public void addPrimo(T val)
    {
        primo = new Elemento(val, primo);
    }

    public void removePrimo()
    {
        primo = primo.next;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Elemento e = primo;
        while (e != null)
        {
            sb.append(e.val);
            if (e.next != null)
                sb.append(", ");
            e = e.next;
        }

        return sb.toString();
    }

}
