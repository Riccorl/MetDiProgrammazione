package retesociale;

public class SuperUtente extends Utente
{
    public SuperUtente(String nome, String cognome, Visibilità visibilità)
    {
        super(nome, cognome, visibilità);
    }

    @Override
    public String getAmiciDi(Utente u)
    {
        return u.getAmici().toString();
    }
}
