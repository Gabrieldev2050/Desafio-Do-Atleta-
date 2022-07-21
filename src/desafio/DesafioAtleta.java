package desafio;

import java.util.Scanner;

public class DesafioAtleta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantidadeDeAtletas;
		int iCont;
		String name;

		System.out.println("Digite a quantidade de Atletas");
		quantidadeDeAtletas = sc.nextInt();

		for (iCont = 1 ; iCont <= quantidadeDeAtletas ; iCont++){
			System.out.println("Qual o Nome do Atleta:\n");
			name=sc.nextLine(); 
		}
		
		

		sc.close();
	}
}
