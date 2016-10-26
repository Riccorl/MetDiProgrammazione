package com.ricesercizi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Convert convert = new Convert("uno due tre quattro");
        ConvertKen convertKen = new ConvertKen("400");

        String s1 = convertKen.convertKen2Letter();

        System.out.println(s1);
    }
}
