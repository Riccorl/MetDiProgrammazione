package metodigenerici;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MetodiGenerici
{
    static public <T> List<T> inverti(List<T> lista)
    {
        List<T> invertita = new ArrayList<>();
        for (T t : lista)
            invertita.add(0, t);

        return invertita;
    }

    static public <T extends Comparable<? super T>> T max(List<T> lista)
    {
        T max = lista.get(0);
        for (T t : lista)
            if (max.compareTo(t) < 0) max = t;

        return max;
    }
}
