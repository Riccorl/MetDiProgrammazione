package com.ricesercizi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SommaDueNumeriPrecedenti sommaDue = new SommaDueNumeriPrecedenti(2, 3, 6);

        String string = sommaDue.sommaNumeri();

        System.out.println(string);
    }
}
