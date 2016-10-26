package factory;

public class ScrittoreAvventura extends ScrittoreFactory
{
    @Override
    public Libro scriviLibro()
    {
        return new LibroAvv();
    }
}
