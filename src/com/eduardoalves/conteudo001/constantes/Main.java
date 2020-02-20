package com.eduardoalves.conteudo001.constantes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclar = new Scanner(System.in);

		Character decide;
		
		System.out.println("*****************Tipos de Apartamentos Disponíveis:******************");
		System.out.println("*101*102*103*202*203*201*301*302*303*304*401*402*403*404*501*502*600*");
		System.out.println("");

		do {

			System.out.println("Informe o número do apartamento");

			int apto = teclar.nextInt();

			switch (apto) {

			case 101:
				UsandoAsConstantes.imprimeTipoDeQuarto(1);
				break;
				
			case 201:
				UsandoAsConstantes.imprimeTipoDeQuarto(1);
				break;
				
			case 301:
				UsandoAsConstantes.imprimeTipoDeQuarto(1);
				break;

			case 102:
				UsandoAsConstantes.imprimeTipoDeQuarto(2);
				break;
				
			case 202:
				UsandoAsConstantes.imprimeTipoDeQuarto(2);
				break;
				
			case 302:
				UsandoAsConstantes.imprimeTipoDeQuarto(2);
				break;

			case 103:
				UsandoAsConstantes.imprimeTipoDeQuarto(3);
				break;
				
			case 203:
				UsandoAsConstantes.imprimeTipoDeQuarto(3);
				break;
				
			case 303:
				UsandoAsConstantes.imprimeTipoDeQuarto(3);
				break;

			case 304:
				UsandoAsConstantes.imprimeTipoDeQuarto(4);
				break;

			case 401:
				UsandoAsConstantes.imprimeTipoDeQuarto(4);
				break;

			case 402:
				UsandoAsConstantes.imprimeTipoDeQuarto(4);
				break;

			case 403:
				UsandoAsConstantes.imprimeTipoDeQuarto(5);
				break;

			case 404:
				UsandoAsConstantes.imprimeTipoDeQuarto(6);
				break;

			case 501:
				UsandoAsConstantes.imprimeTipoDeQuarto(7);
				break;

			case 502:
				UsandoAsConstantes.imprimeTipoDeQuarto(8);
				break;

			case 600:
				UsandoAsConstantes.imprimeTipoDeQuarto(9);
				break;

			default:
				System.out.println("quarto não existe");
				break;
			}
			System.out.println("");
			System.out.println("Nova consulta? Digite s para sim, n para sair");

			decide = teclar.next().charAt(0);

		} while (decide.equals('s') || (decide.equals('S')));

		System.out.println("sistema encerrado");

		teclar.close();
	}
}

