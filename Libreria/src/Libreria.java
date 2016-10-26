import java.util.ArrayList;

/**
 * Created by Ric on 30/03/16.
 */
public class Libreria
{
    private ArrayList<Scaffale> scaffali;

    public void addScaff(Scaffale s)
    {
        scaffali.add(s);
    }

    public void removeScaff(Scaffale s)
    {
        scaffali.remove(s);
    }

    public Scaffale getScaffale(int k)
    {
        return scaffali.get(k);
    }

    public int numeroScaff()
    {
        return scaffali.size();
    }

}
