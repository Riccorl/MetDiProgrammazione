package eserciziario.es322;

public class Coppia<T extends Comparable<T>> implements Comparable<Coppia<T>>
{
    private T x;
    private T y;

    public Coppia(T x, T y)
    {
        this.x = x;
        this.y = y;
    }

    public T getX()
    {
        return x;
    }

    public void setX(T x)
    {
        this.x = x;
    }

    public T getY()
    {
        return y;
    }

    public void setY(T y)
    {
        this.y = y;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        return sb.append("(").append(x).append(", ").append(y).append(")").toString();
    }

    @Override
    public int compareTo(Coppia<T> o)
    {
        return getX().compareTo(o.getX());
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Coppia)) return false;

        Coppia<?> coppia = (Coppia<?>) o;

        if (x != null ? !x.equals(coppia.x) : coppia.x != null) return false;
        return y != null ? y.equals(coppia.y) : coppia.y == null;

    }

    @Override
    public int hashCode()
    {
        int result = x != null ? x.hashCode() : 0;
        result = 31 * result + (y != null ? y.hashCode() : 0);
        return result;
    }
}
