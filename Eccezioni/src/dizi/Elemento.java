package dizi;

public class Elemento<T>
{
    private T e;

    public Elemento(T e)
    {
        this.e = e;
    }

    public T getE()
    {
        return e;
    }

    public void setE(T e)
    {
        this.e = e;
    }

    @Override
    public String toString()
    {
        return e.toString();
    }
}
