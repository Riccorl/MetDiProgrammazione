package com.ricesercizi;

public class CashRegisterTest
{

    public static void main(String[] args) {
	// write your code here

        CashRegister cassa1 = new CashRegister();

        cassa1.getPrice(3.50);
        cassa1.getPrice(4.0);
        cassa1.getPrice(55.75);

        double total = cassa1.getTotal();
        String change = cassa1.getChange(200);

        System.out.println(total);
        System.out.println(change);

    }
}
