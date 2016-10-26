package esonero2.esercizio211;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sparatutto_Vecchia
{
    private Object[][] tabellone = new Object[5][10];
    private Navicella nav;
    private List<Nemico> nemici;

    public Sparatutto_Vecchia(Navicella nav, List<Nemico> nemici)
    {
        this.nav = nav;
        this.nemici = new ArrayList<Nemico>(nemici);

        for (Nemico n : nemici)
            tabellone[n.pY][n.pX] = n;

        for (int i = 0; i < 3; i++)
        {
            int x = new Random().nextInt(5);
            int y = new Random().nextInt(10);

            if (tabellone[x][y] == null)
                tabellone[x][y] = new Stella();
            else i--;
        }

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (tabellone[i][j] == null) tabellone[i][j] = new Vuoto();
            }
        }

    }

    public void prossimoPasso()
    {
        for (Nemico n : nemici)
        {
            tabellone[n.pY][n.pX] = new Vuoto();
            n.prossimoPasso();
            tabellone[n.pY][n.pX] = n;
        }

    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        tabellone[nav.getpY()][nav.getpX()] = nav;

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                sb.append(tabellone[i][j].toString());
                if (tabellone[i][j].equals(nav))
                {
                    if (nav.getBLaser())
                    {
                        for (int k = j+1; j< 9; j++)
                        {
                            tabellone[i][k] = "-";
                            sb.append(tabellone[i][k]);
                        }
                    }
                }
            }
            sb.append("/n").append('\n');
        }
        return sb.toString();
    }

    public Object[][] getTabellone()
    {
        return tabellone;
    }
}
