package eserciziario.es323;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestMultiMappa
{
    public static void main(String[] args)
    {
        MultiMappa<Integer, Integer> multiMappa = new MultiMappa<>();

        for (int j = 0; j < 10; j++)
            for (int i = 0; i < 10; i++)
                multiMappa.put(j, i);

        MultiMappa<Integer, Integer> multiMappa2 = new MultiMappa<>();

        for (int j = 1; j < 9; j++)
            for (int i = 3; i < 6; i++)
                multiMappa2.put(j, i);

        System.out.println(multiMappa);

        System.out.println(multiMappa.get(1));

        System.out.println(multiMappa.contains(1, 12));

        Set<Integer> set1 = new HashSet<>(Arrays.asList(
                1, 2, 3
        ));

        multiMappa.intersectMultiMappa(multiMappa2);

        System.out.println(multiMappa);

    }
}
