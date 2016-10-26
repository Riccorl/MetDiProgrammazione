package pila;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSucc
{
    public static void main(String[] args)
    {
        SuccessioniNum2 succ1 = new SuccessioniNum2();

        List<Integer> fib = new ArrayList<>(Arrays.asList(
                1, 1, 2, 3, 5, 8, 13, 21, 34));
        succ1.addSuccessione("Fibonacci", fib);

        List<Double> nmezzi = new ArrayList<>(Arrays.asList(
                1.0, 0.5, 0.3, 0.25, 0.2, 0.16));
        succ1.addSuccessione("1/n", nmezzi);

        System.out.println(succ1.getSuccessione("Fibonacci"));
        System.out.println(succ1.getSuccessione("1/n"));
    }
}
