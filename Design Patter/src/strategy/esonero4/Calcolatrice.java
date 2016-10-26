package strategy.esonero4;

public class Calcolatrice
{
    private double totale;
    private FunzionePers f1;
    private FunzionePers f2;

    public void add(double v) { totale += v; }
    public void sub(double v) { totale -= v; }
    public void mul(double v) { totale *= v; }
    public void div(double v) { totale /= v; }

    public void setF1(FunzionePers f1)
    {
        this.f1 = f1;
    }

    public void setF2(FunzionePers f2)
    {
        this.f2 = f2;
    }

    public void f1(double v)
    {
        totale = f1.funzione(v);
    }

    public void f2(double v)
    {
        totale = f2.funzione(v);
    }

    public double getTotale() { return totale; }

    public static void main(String[] args)
    {
        Calcolatrice c = new Calcolatrice();

        // scrivi qui l’istruzione Java 8 per impostare Math.log in f1:
        c.setF1(Math::abs);

        // Java 7
        c.setF1(new FunzionePers()
        {
            @Override
            public double funzione(double v)
            {
                return Math.log(v);
            }
        });

        c.f1(2);

        System.out.println(c.getTotale());
    }
}
