package com.estudofiap.javafundments;

public class TiposDados2v {

	public static void main(String[] args) {
		// variables type.

		int idade = 15;
		double preco = 10.0;
		char sexo = 'M';
	//	boolean maioridade = false;
		int acompanhanteidade = 21;

		System.out.println("==================================");
		System.out.println("PRECO DO INGRESSO : " + preco + " REAIS");
		System.out.println("SEXO : " + sexo);
		System.out.println("IDADE : " + idade + " ANOS");

		if (idade >= 21) {
			System.out.println("VOC� PODE ENTRAR NA FESTA.");
		} else {
			System.out.println("VOC� TEM " + idade + " ANOS, N�O PODE ENTRAR NA FESTA.");
		}

		System.out.println("==================================");
		
		System.out.println("A IDADE DE SEU ACOMAPANHANTE ? : [ " + acompanhanteidade + " ANOS]");
		
		for(int acompanhante = 0; acompanhante < 1; acompanhante++) {
			acompanhante += 1;
			if (acompanhante == 1) {
				System.out.println("COM O ACOMPANHATE VOC� PODE ENTRA!");
			}else {
				System.out.println("SEM ACOMPANHANTE VOC� N�O VAI ENTRAR");
			}
		}

	}

}
