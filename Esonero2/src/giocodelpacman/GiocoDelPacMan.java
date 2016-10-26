package giocodelpacman;

import java.util.List;

public class GiocoDelPacMan
{
    private PacMan pacMan;
    private Cella[][] campo;
    private List<Fantasmino> fantasmini;

    public GiocoDelPacMan(int n, PacMan pacMan)
    {
        this.pacMan = pacMan;
        campo = new Cella[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                campo[i][j] = new CellaLibera();
        }


    }
}
