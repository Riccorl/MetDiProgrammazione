package factory;

public class ScrittoreGialli extends ScrittoreFactory
{
    @Override
    public Libro scriviLibro()
    {
        return new LibroGiallo();
    }
}
