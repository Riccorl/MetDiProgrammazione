package com.ricesercizi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] a1 = {1, 2, 3, 4, 5, 6, 7};
        int[] a2 = {1, 2, 3, 4, 5, 6, 7};

        GestoreArray g = new GestoreArray(a1);

        g.concat(a2);

        int k = g.indexOf(0);
        System.out.println(k);
    }
}
