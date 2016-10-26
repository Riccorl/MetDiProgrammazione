package esonero2.esercizio235;

public class Punto implements Resettabile
{
    private int x, y, z;
    private int x2, y2, z2;

    public Punto(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void reset()
    {
        x = x2;
        y = y2;
        z = z2;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getZ()
    {
        return z;
    }

    public void setX(int x)
    {
        x2 = this.x;
        this.x = x;
    }

    public void setY(int y)
    {
        y2 = this.y;
        this.y = y;
    }

    public void setZ(int z)
    {
        z2 = this.z;
        this.z = z;
    }
}
