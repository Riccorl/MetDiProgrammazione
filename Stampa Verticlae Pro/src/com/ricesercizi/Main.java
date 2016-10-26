package com.ricesercizi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String frase1 = input.nextLine();
        String frase2 = input.nextLine();
        String frase3 = input.nextLine();

        StampaVerPro strv = new StampaVerPro(frase1, frase2, frase3);

        String s = strv.stampaVerPro();

        System.out.println(s);
    }
}
