package dizi;

import java.util.List;

public class Mappa<T, S> implements Dizionario
{
    private List<Coppia<T, S>> listaCoppie;

    public Mappa(List<Coppia<T, S>> listaCoppie)
    {
        this.listaCoppie = listaCoppie;
    }

    @Override
    public Elemento<S> search(Chiave<T> k) throws ElementNotFoundException
    {
        Coppia<T, S> c = new Coppia(k, null);
        return listaCoppie.get(listaCoppie.indexOf(c)).getE();
    }

    @Override
    public void add(Chiave k, Elemento e) throws ElementAlreadyContainedException
    {
        Coppia c = new Coppia(k, e);
        if (listaCoppie.contains(c)) throw new ElementAlreadyContainedException();

        listaCoppie.add(c);
    }

    @Override
    public <T> Elemento delete(Chiave k) throws ElementNotFoundException
    {
        Coppia c = new Coppia(k, null);
        if (!listaCoppie.contains(c)) throw new ElementNotFoundException();

        Elemento<T> e = new Elemento(listaCoppie.get(listaCoppie.indexOf(c)).getE());
        listaCoppie.remove(c);
        return e;
    }

    @Override
    public int size()
    {
        return listaCoppie.size();
    }


    @Override
    public String toString()
    {
        return listaCoppie.toString();
    }

}
