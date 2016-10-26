package successioni;

public class TestSucc
{
    public static void main(String[] args)
    {
        int count = 0;
        for (Integer i : new Fibonacci())
        {
            System.out.println(i);
            count++;

            if (count > 5) break;
        }
    }
}
