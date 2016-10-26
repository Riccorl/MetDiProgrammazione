package eserciziario.es324;

public class TestMultiIns
{
    public static void main(String[] args)
    {
        MultiInsieme<Integer> interi = new MultiInsieme<>();
        MultiInsieme<Integer> interi2 = new MultiInsieme<>();


        interi.add(1);
        interi.add(1);
        interi.add(1);
        interi.add(2);
        interi.add(3);
        System.out.println(interi.add(5));
        System.out.println(interi.add(5));

        System.out.println(interi.get(9));

        System.out.println(interi.contains(4));

        interi2.add(1);
        interi2.add(1);
        interi2.add(1);
        interi2.add(2);
        interi2.add(3);

        System.out.println(interi.toString());
        interi.intersect(interi2);
        System.out.println();
        System.out.println(interi.toString());

        System.out.println(interi.toSet());


    }
}
