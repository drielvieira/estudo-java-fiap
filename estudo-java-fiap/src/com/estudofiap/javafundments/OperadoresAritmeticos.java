package com.estudofiap.javafundments;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int xax = 9;
		int yay = 2;
		
		int soma = xax + yay;
		int subtracao = xax - yay;
		int multiplicacao = xax * yay;
		int divisao = xax / yay;
		int resto = xax % yay;
		
		System.out.println("Resultado da adição: " + soma);
		System.out.println("Resultado da subtração: " + subtracao);
		System.out.println("Resultado da multiplicação: " + multiplicacao);
		System.out.println("Resultado da dicisão: " + divisao);
		System.out.println("Resultado do módulo: " + resto);
		
		System.out.println("=================================================");
		
		xax++;
		System.out.println("Resultado do incremento de xax: " + xax);
		
		yay--;
		System.out.println("Resultado do decremento de yay: " + yay);
		
		xax += 10;
		System.out.println("Atribuição aditiva de xax: " + xax);
		
		yay-= 10;
		System.out.println("Atribuição subtrativa de y: " + yay);
	}

}
