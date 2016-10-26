package com.ricesercizi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dizionario diz = new Dizionario();

        diz.put("Dio", 3);
        diz.put("Porco", 4);
        diz.put("Ladro", 5);

        String s = diz.toString();

        int g = diz.get("Dio");
        System.out.println(s);
    }
}
