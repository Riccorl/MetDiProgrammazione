package com.ricesercizi;

public class RettangoloTest {

    public static void main(String[] args) {
	// write your code here

        Rettangolo rettangolo1 = new Rettangolo(0, 0, 20, 10);

        String traslato = rettangolo1.trasla(10, -5);
        String coordinate = rettangolo1.toString();

        System.out.println(traslato);
        System.out.println(coordinate);
    }
}
