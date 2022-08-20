package com.estudofiap.javafundments;

public class Conversoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		System.out.println(x + " [tipo inteiro] -> o tipo já era int (x).");
		double d = x;
		System.out.println(d + " [tipo double] -> pegou (x) e converteu para double.");
		long l = x;
		System.out.println(l + " [tipo long] -> pegou (x) e converteu para long.");
		float f = x;
		System.out.println(f + " [tipo float] -> pegou (x) e converteu para float.");
		
		System.out.println("===========================================================");
		
		double valorDouble= 9.99;
		int valorInt = (int) valorDouble;
		System.out.println(valorInt + " [OUVER PERDA DE INFORMAÇÃO] double -> int");

	}

}
