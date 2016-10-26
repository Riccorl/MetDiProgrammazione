import java.util.ArrayList;

/**
 * Created by Ric on 31/03/16.
 */
public class Scaffale
{
    public class ScaffalePienoEx extends Exception {}

    private final int CAPIENZA;
    private ArrayList<Libro> libri;

    public Scaffale(final int CAPIENZA)
    {

        this.CAPIENZA = CAPIENZA;
        libri = new ArrayList<>(CAPIENZA);
    }

    public void addLibro(Libro l) throws ScaffalePienoEx
    {
        if (libri.size() == CAPIENZA) throw new ScaffalePienoEx();
        libri.add(l);
    }

    public void removeLibro(String titolo)
    {
        ArrayList<Libro> libriDaRim = new ArrayList<>();

        for (Libro l : libri)
            if (l.getTitolo().equals(titolo)) libriDaRim.add(l);

        libri.removeAll(libriDaRim);
    }

    public Libro cerca(String titolo)
    {
        for (Libro l : libri)
            if (l.getTitolo().equals(titolo)) return l;
        return null;
    }

    public ArrayList<Libro> cercaNonLetti()
    {
        ArrayList<Libro> nonLetti = new ArrayList<>();

        for (Libro l : libri)
            if (!l.isLetto()) nonLetti.add(l);

        return nonLetti;
    }

}
