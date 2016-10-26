package com.ricesercizi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ContoBancario contoJacopo = new ContoBancario("sldihjvkd",1000);

        System.out.println(contoJacopo.denaro);

        PrelevaDenaro preleva = new PrelevaDenaro(contoJacopo, 200);

        preleva.esegui();

        System.out.println(contoJacopo.denaro);


    }
}
