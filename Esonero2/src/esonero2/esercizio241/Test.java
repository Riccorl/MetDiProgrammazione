package esonero2.esercizio241;

import java.util.Arrays;
import java.util.HashSet;

public class Test
{
    public static void main(String[] args)
    {
        ElaboraStringhe e = s -> ""+s.length();
        ElaboraStringhe e2 = s -> s.length() < 5 ? s : s.substring(0, 5);

        System.out.println(e.elabora("Diocancaro"));
        System.out.println(e2.elabora("Dio"));

        //
        System.out.println();
        //

        String stringa1 = "Orcodio";
        String stringa2 = "Dio";

        VerificaStringa v = (s1, s2) -> s1.contains(s1);
        VerificaStringa v2 = (s1, s2) -> s1.length() > s2.length() && s1.endsWith(s2);

        System.out.println(v.verifica(stringa1, stringa2));
        System.out.println(v2.verifica(stringa1, stringa2));

        //
        System.out.println();
        //

        HashSet<Integer> hash = new HashSet<>(Arrays.asList(1, 3, 4, 2));

        FunzioneSuInsieme f = (k, h) -> {
            int somma = 0;
            for (int i : h)
                if (i <= k) somma += i;
            return somma;
        };

        System.out.println(f.applica(3 , hash));

    }

}
