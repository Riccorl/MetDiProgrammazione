package com.ricesercizi;

import java.util.Arrays;

public class Main {

    public String sostituisci(int[] arrayInt, int primo, int secondo)
    {
        for (int i = 0; i < arrayInt.length; i++)
        {
            if (arrayInt[i] == primo) arrayInt[i] = secondo;
        }

        return Arrays.toString(arrayInt);
    }

    public boolean equals(String s, String t)
    {
        return s == t;
    }

    public static void main(String[] args) {
	// write your code here
        Main swap = new Main();
        int[] a = {1, 2, 3, 4, 5};
        String r = swap.sostituisci(a, 2, 4);

        boolean b = swap.equals("vane", "Cane");

        int x = (char) 100;

        System.out.print(x);


    }
}
