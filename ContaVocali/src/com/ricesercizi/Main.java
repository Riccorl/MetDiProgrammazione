package com.ricesercizi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ContaVocali contaQuelleVocali = new ContaVocali();

        String frase = "Tu madre quaa cojona";
        String vocals = contaQuelleVocali.getVocals(frase);

        System.out.println(vocals);


    }
}
