package com.playermusicale;


public abstract class RiproduttoreMusicale
{
    protected boolean controlloSupporto;
    protected String branoInEsecuzione;
    protected Supporto s;
    protected int index;

    public class RiproduttorePieno extends Exception
    {
        public String toString() { return "Riproduttore Pieno";}
    }

    public class RiproduttoreVuoto extends Exception
    {
        public String toString() { return "Riproduttore Vuoto";}
    }

    public void inserisciSupporto() throws RiproduttorePieno
    {
        if (controlloSupporto) throw new RiproduttorePieno();
        controlloSupporto = true;
    }

    public void espelliSupporto() throws RiproduttoreVuoto
    {
        if (!controlloSupporto) throw new RiproduttoreVuoto();
        controlloSupporto = false;
    }

    public void play(Brano b)
    {
        branoInEsecuzione = b.getTitolo();
        index = s.getBrani().indexOf(b);
    }

    public void stop()
    {
        branoInEsecuzione = null;
    }

    public void next()
    {
        index++;
        if (index >= s.getBrani().size()) index = 0;
        Brano b = s.getBrani().get(index);
        branoInEsecuzione = b.getTitolo();
    }

    public void prev()
    {
        index--;
        if (index < 0) index = s.getBrani().size()-1;
        Brano b = s.getBrani().get(index);
        branoInEsecuzione = b.getTitolo();
    }

    public String getBrano()
    {
        return branoInEsecuzione;
    }

    public String toString()
    {
        Brano b = s.getBrani().get(index);
        return b.toString();
    }
}
