package esonero2.esercizio211;

import java.util.List;
import java.util.Random;

public class Sparatutto
{
    private Sfondo[][] tabellone = new Sfondo[5][10];
    private Navicella nave;
    private List<Nemico> nemici;
    private Laser l = new Laser();

    public Sparatutto(Navicella nave, List<Nemico> nemici)
    {
        this.nave = nave;
        this.nemici = nemici;

        tabellone[nave.getpY()][nave.getpX()] = new Oggetto(nave.toString());

        for (Nemico nemico : nemici)
            tabellone[nemico.pY][nemico.pX] = new Oggetto(nemico.toString());

        int k = 0;
        while (k < 3)
        {
            int y = new Random().nextInt(5);
            int x = new Random().nextInt(10);

            if (tabellone[y][x] == null)
            {
                tabellone[y][x] = new Stella();
                k++;
            }
        }

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 10; j++)
                if (tabellone[i][j] == null) tabellone[i][j] = new Vuoto();
        }
    }

    public void prossimoPasso()
    {
        for (Nemico nemico : nemici)
        {
            tabellone[nemico.pY][nemico.pX] = new Vuoto();
            nemico.prossimoPasso();
            tabellone[nemico.pY][nemico.pX] = new Oggetto(nemico.toString());
        }
    }

    private void laser(int y,int x)
    {
        if (nave.getBLaser())
        {
            for (int k = x+1; x < 9; x++)
            {
                tabellone[y][k] = new Oggetto(l.toString());
            }
        }

    }

    private void svuotaTab()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (tabellone[i][j].equals("-"))
                    tabellone[i][j] = new Vuoto();
            }
        }
    }

    @Override
    public String toString()
    {
        svuotaTab();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<5; i++)
        {
            for (int j = 0; j<10; j++)
            {
                sb.append(tabellone[i][j].toString());
                if (tabellone[i][j].toString() == "N")
                    laser(i, j);
            }
            sb.append("/n").append('\n');
        }
        return sb.toString();
    }

    public Sfondo[][] getTabellone()
    {
        return tabellone;
    }
}
