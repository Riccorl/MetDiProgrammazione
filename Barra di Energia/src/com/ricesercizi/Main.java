package com.ricesercizi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BarraDiEnergia barra1 = new BarraDiEnergia(7);
        BarraDiEnergiaConPercentuale barraPerc1 = new BarraDiEnergiaConPercentuale(7);

        String s = barra1.toString();
        String sp = barraPerc1.toString();
        barra1.incrementaBarra();
        barra1.incrementaBarra();
        barra1.incrementaBarra();
        barraPerc1.incrementaBarra();
        barraPerc1.incrementaBarra();
        barraPerc1.incrementaBarra();
        barraPerc1.incrementaBarra();
        String s2 = barra1.toString();
        String sp2 = barraPerc1.toString();


        System.out.println(sp);
        System.out.println(s2);
        System.out.println(sp2);
    }
}
