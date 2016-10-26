package com.playermusicale;

public class Brano
{
    private String artista;
    private String titolo;

    public Brano(String artista, String titolo)
    {
        this.artista = artista;
        this.titolo = titolo;
    }

    public String getArtista()
    {
        return artista;
    }

    public String getTitolo()
    {
        return titolo;
    }

   @Override
    public String toString()
    {
        return artista + " - " + titolo;
    }
}
