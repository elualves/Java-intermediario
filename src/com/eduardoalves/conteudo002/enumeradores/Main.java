package com.eduardoalves.conteudo002.enumeradores;

//O objetivo deste programa é comparar enums e constantes

public class Main {

	// ***C O N S T A N T E S**I N Í C I O***//
	public static void main(String[] args) {
		usandoConstantes();

		System.out.println("");

		usandoEnum();
	}

	private static void usandoConstantes() {
		// imprimeDiaSemana(1);
		int segunda = DiaSemanaConstantes.SEGUNDA;

		// imprimeDiaSemana(2);
		int terca = DiaSemanaConstantes.TERCA;

		// imprimeDiaSemana(3);
		int quarta = DiaSemanaConstantes.QUARTA;

		// imprimeDiaSemana(4);
		int quinta = DiaSemanaConstantes.QUINTA;

		// imprimeDiaSemana(5);
		int sexta = DiaSemanaConstantes.SEXTA;

		// imprimeDiaSemana(6);
		int sabado = DiaSemanaConstantes.SABADO;

		// imprimeDiaSemana(7);
		int domingo = DiaSemanaConstantes.DOMINGO;

		System.out.println("Teste utilizando constantes no Java");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);

	}

	private static void imprimeDiaSemana(int dia) {

		if (dia == 1) {
			System.out.println("Segunda-feira-cons");
		} else if (dia == 2) {
			System.out.println("Terça-feira-cons");
		} else if (dia == 3) {
			System.out.println("Quarta-feira-cons");
		} else if (dia == 4) {
			System.out.println("Quinta-feira-cons");
		} else if (dia == 5) {
			System.out.println("Sexta-feira-cons");
		} else if (dia == 6) {
			System.out.println("Sábado-cons");
		} else if (dia == 7) {
			System.out.println("Domingo-cons");
		}
	}
	// ***C O N S T A N T E S **F I M***//

	// ***E N U M S **I N Í C I O***//
	private static void usandoEnum() {

		// O enum é do tipo DiaSemana
		DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
		DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
		DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
		DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
		DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
		DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
		DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;

		System.out.println("Teste utilizando enum no Java");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}

	private static void imprimeDiaSemana(DiaSemanaEnum dia) {

		if (dia.equals(DiaSemanaEnum.SEGUNDA)) {
			System.out.println("Segunda-feira-enum");

		} else if (dia.equals(DiaSemanaEnum.TERCA)) {
			System.out.println("Terça-feira-enum");

		} else if (dia.equals(DiaSemanaEnum.QUARTA)) {
			System.out.println("Quarta-feira-enum");

		} else if (dia.equals(DiaSemanaEnum.QUINTA)) {
			System.out.println("Quinta-feira-enum");

		} else if (dia.equals(DiaSemanaEnum.SEXTA)) {
			System.out.println("Sexta-feira-enum");

		} else if (dia.equals(DiaSemanaEnum.SABADO)) {
			System.out.println("Sábado-enum");

		} else if (dia.equals(DiaSemanaEnum.DOMINGO)) {
			System.out.println("Domingo-enum");
		}
	}
	// ***E N U M S**F I M***//
}
