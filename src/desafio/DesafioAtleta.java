package desafio;

import java.util.Scanner;

public class DesafioAtleta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantidadeDeAtletas;
		int iCont;
		double altura;
		double peso;
		String name;
		char sexo;

		// System.out.println("Digite a quantidade de Atletas");
		// quantidadeDeAtletas = sc.nextInt();
		System.out.println("Qual o Nome do Atleta:");
		name = sc.nextLine();
		System.out.println("Sexo:\n");
		sexo = sc.next().charAt(0);
		System.out.println("Digite a Altura:\n");
		altura = sc.nextDouble();
		System.out.println("Digite o Peso");
		peso = sc.nextDouble();

		if (altura < 0) {
			System.out.println("Digite uma altura válida");
			altura = sc.nextDouble();
		}

		if (peso < 0) {
			System.out.println("Digite uma altura válida");
			altura = sc.nextDouble();
		}
		
		if (sexo != 'M' || sexo != 'm' || sexo != 'F'|| sexo != 'f' ) {
			System.out.println("Digite um Sexo Válido"); 
		}

		sc.close();
	}
}
