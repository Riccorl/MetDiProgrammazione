package dizi;

public class Chiave<T>
{
    private T k;

    public Chiave(T k)
    {
        this.k = k;
    }

    public T getK()
    {
        return k;
    }

    public void setK(T k)
    {
        this.k = k;
    }

    @Override
    public String toString()
    {
        return k.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Chiave)) return false;

        Chiave<?> chiave = (Chiave<?>) o;

        return k != null ? k.equals(chiave.k) : chiave.k == null;

    }

    @Override
    public int hashCode()
    {
        return k != null ? k.hashCode() : 0;
    }
}
