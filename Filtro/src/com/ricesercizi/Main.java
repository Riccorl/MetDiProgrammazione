package com.ricesercizi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 3, 4, 4, 5, 6};
        int[] b = {4, 5};
        Filtro filtro = new Filtro(a);

        int[] a2 = filtro.filtra(b);
        System.out.println(Arrays.toString(a2));
    }
}
