package esonero2.esercizio235;

public class TestReset
{
    public static void main(String[] args)
    {
        Punto p = new Punto(10, 2, 3);

        System.out.println(p.getX());

        p.setX(4);
        System.out.println(p.getX());

        p.reset();
        System.out.println(p.getX());
    }
}
