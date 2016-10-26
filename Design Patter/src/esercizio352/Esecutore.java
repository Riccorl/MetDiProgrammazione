package esercizio352;

public class Esecutore implements Observer
{
    public void esegui()
    {
        System.out.println("Bottone Premuto");
    }

    @Override
    public void update()
    {
        esegui();
    }
}
