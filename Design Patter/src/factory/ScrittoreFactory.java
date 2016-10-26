package factory;

abstract public class ScrittoreFactory
{

    public Libro creaLibro()
    {
        return scriviLibro();
    }

    abstract public Libro scriviLibro();
}
