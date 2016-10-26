package com.ricesercizi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {};
        MioArray mioArray = new MioArray(a);

        boolean b = mioArray.bContiene(5, 6);
        System.out.println(b);

        int somma = mioArray.somma2();
        System.out.println(somma);

        mioArray.scambio(8,1);
        System.out.println(Arrays.toString(a));

        mioArray.scambio(1,2);
        System.out.println(Arrays.toString(a));

        int max = mioArray.maxTripla();
        System.out.println(max);

        int[] inDue = mioArray.falloInDue();
        System.out.println(Arrays.toString(inDue));
    }
}
