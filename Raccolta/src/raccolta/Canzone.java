package raccolta;

public class Canzone
{
    private String nome;
    private String autore;

    public Canzone(String nome, String autore)
    {
        this.nome = nome;
        this.autore = autore;
    }

    public String getNome() { return nome; }

    public String getAutore() { return autore; }

    @Override
    public String toString() { return nome; }

    @Override
    public int hashCode()
    {
        return nome.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || o.getClass() != getClass())
            return false;

        Canzone c = (Canzone)o;
        return nome.equals(c.nome)
                && autore.equals(c.autore);
    }
}
