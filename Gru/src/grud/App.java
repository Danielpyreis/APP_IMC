package grud;

import java.util.Scanner;

public class App {

	public static String classIMC(double imc) {
		if (imc < 18.5) {
			return "Baixo peso";
		} else if (imc == 18.5 || imc <= 24.9) {
			return "Peso Normal";
		} else if (imc == 25 || imc <= 29.9) {
			return "Sobrepeso";
		} else if (imc == 30 || imc <= 34.9) {
			return "Obesidade grau 1";
		} else if (imc == 35.0 || imc <= 39.9) {
			return "Obesidade grau 2";
		} else if (imc > 40) {
			return "Obesidade extrema";
		}
		return null;
	}

	public static double calPeso(double peso, double altura) {
		return peso / (altura * altura);

	}

	public static void progIMC(String versao) {
		double peso, altura, imc;
		Scanner pScan = new Scanner(System.in);
		Scanner aScan = new Scanner(System.in);

		System.out.println("===========================");
		System.out.printf("Cálculo do IMC - Versão %s\n", versao);
		System.out.println("===========================");

		System.out.print("Insira o seu peso em quilogramas: ");
		peso = Double.parseDouble(pScan.nextLine());

		System.out.print("Insira o sua altura em metros: ");
		altura = Double.parseDouble(aScan.nextLine());

		imc = calPeso(peso, altura);

		System.out.printf("\nSeu índice de massa corporal é: %.2f kg/m²\n", imc);
		System.out.printf("Classificação: %s.\n", classIMC(imc));
	}

	public static void main(String[] args) {
		String versao = "1.0";
		progIMC(versao);
	}
}
