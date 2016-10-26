package com.ricesercizi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();

        StringaVerticale strv = new StringaVerticale(frase);

        String s = strv.stampaVer();

        System.out.println(s);

    }
}
