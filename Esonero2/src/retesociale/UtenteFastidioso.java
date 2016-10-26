package retesociale;

public class UtenteFastidioso extends Utente
{
    public UtenteFastidioso(String nome, String cognome, Visibilità visibilità)
    {
        super(nome, cognome, visibilità);
    }

    @Override
    public void richiediAmicizia(Utente u)
    {
        for (int i = 0; i < 3; i++)
            u.richieste.add(this);
    }
}
