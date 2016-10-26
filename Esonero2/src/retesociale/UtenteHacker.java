package retesociale;

public class UtenteHacker extends Utente
{
    public UtenteHacker(String nome, String cognome, Visibilità visibilità)
    {
        super(nome, cognome, visibilità);
    }

    public void hackera(Utente u)
    {
        u.amici.clear();
    }
}
