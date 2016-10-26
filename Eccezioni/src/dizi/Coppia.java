package dizi;

public class Coppia<T, S>
{
    private Chiave<T> k;
    private Elemento<S> e;

    public Coppia(Chiave<T> k, Elemento<S> e)
    {
        this.k = k;
        this.e = e;
    }

    public Chiave getK()
    {
        return k;
    }

    public void setK(Chiave k)
    {
        this.k = k;
    }

    public Elemento getE()
    {
        return e;
    }

    public void setE(Elemento e)
    {
        this.e = e;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        return sb.append("(").append(k).append(", ").append(e).append(")").toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Coppia)) return false;

        Coppia coppia = (Coppia) o;

        return k.equals(coppia.k);

    }

    @Override
    public int hashCode()
    {
        return k.hashCode();
    }
}
