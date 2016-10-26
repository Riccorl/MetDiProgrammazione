package esonero2.esercizio238;

import java.util.ArrayList;

public class UfficioPostale implements Aggiungibile, Estraibile
{
    private ArrayList<Clienti> coda;

    public UfficioPostale()
    {
        coda = new ArrayList<>();
    }

    @Override
    public void aggiungi(Object o) throws DiversoTipo
    {
        if (!(o instanceof Clienti)) throw new DiversoTipo();
        Clienti c = (Clienti) o;
        coda.add(c);
    }

    @Override
    public Clienti estrai() throws CodaVuota
    {
        if (coda.size() == 0) throw new CodaVuota();
        Clienti c = coda.get(0);
        coda.remove(0);

        return c;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Clienti c : coda)
            sb.append(c.getS()).append(", ");

        return sb.toString();
    }

}
