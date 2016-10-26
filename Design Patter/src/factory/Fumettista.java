package factory;

public class Fumettista extends ScrittoreFactory
{
    @Override
    public Libro scriviLibro()
    {
        return new Fumetto();
    }
}
