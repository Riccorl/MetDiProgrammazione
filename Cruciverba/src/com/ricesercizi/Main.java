package com.ricesercizi;


import java.util.Arrays;

public class Main {

    int[] a = { 1, 2, 3, 4};
    public boolean contiene(int i, int j)
    {
        return a.length > 0 && a[i] == j;
    }

    public static void main(String[] args) {
	// write your code here
        String[] a = {"cane", "pane", "cojone"};
        Cruciverba cruci = new Cruciverba(5,5);
        boolean b = cruci.set("pa");
        boolean b1 = cruci.set("ca");

        Main cont = new Main();

        boolean v = cont.contiene(0, 1);


        String s = cruci.toString();
        System.out.println(s);
        System.out.println(v);

    }
}
