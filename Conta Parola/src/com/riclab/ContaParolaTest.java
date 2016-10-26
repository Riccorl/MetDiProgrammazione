package com.riclab;

public class ContaParolaTest {

    public static void main(String[] args) {
	// write your code here

        String s = "Tua madre è una zoccola di zoccola";
        String t = "sosso";
        ContaParola contatore = new ContaParola(s, t);


        int f = contatore.numeroParola();
        System.out.println(f);

    }
}
