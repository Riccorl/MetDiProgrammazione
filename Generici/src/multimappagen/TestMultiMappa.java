package multimappagen;

import java.util.function.Predicate;

public class TestMultiMappa
{
    public static void main(String[] args)
    {
        MultiMappa<Integer, Integer> mm1 = new MultiMappa<>();

        mm1.put(1, 1);
        mm1.put(1, 2);
        mm1.put(1, 3);
        mm1.put(1, 4);
        mm1.put(2, 4);
        mm1.put(2, 3);
        mm1.put(2, 2);
        mm1.put(2, 1);
        System.out.println(mm1);
        System.out.println(mm1.get(1));

        Predicate<Integer> p = x -> x % 2 == 0;
        System.out.println(mm1.get(1, p));
        System.out.println(mm1.values());
        System.out.println(mm1.valuesSet());

    }
}
