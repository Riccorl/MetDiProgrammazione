package com.ricesercizi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Chihuahua chi = new Chihuahua();
        Millepiedi mi = new Millepiedi();

        int a = mi.getNumeroDiZampe();
        System.out.println(a);
        System.out.println(mi.emettiVerso());
        System.out.println(mi.getTaglia());


    }
}
