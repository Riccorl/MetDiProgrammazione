package com.ricesercizi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DivisoreProprio divpr = new DivisoreProprio();

        String str = divpr.divPropri(20);
        String str2 = divpr.divPropriInv(20);

        System.out.println(str);
        System.out.println(str2);
    }
}
