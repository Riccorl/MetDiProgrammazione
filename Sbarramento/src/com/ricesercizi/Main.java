package com.ricesercizi;

import java.util.Arrays;

public class Main {

    private int k;

    public static void main(String[] args) {
	// write your code here
        Sbarramento sbar = new Sbarramento();

        int[] a = sbar.fatt(-2);

        String s = null;
        int j = sbar.contaCaratteri(s, 'c');
        int mol = sbar.moltiplica(new int[] {1, 2, 3, 4, 4}, 1, 2);

        sbar.string();
        char c = (char) 100000;
        System.out.println(mol);
        System.out.println(Arrays.toString(a));
    }
}
