package desafio;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAtleta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int iCont;
		double quantidadeDeHomens = 0; 
		double quantidadeDeAtletas;
		double altura;
		double peso;
		double somaMediaPeso = 0; 
		double pesoMedio = 0;
		String name;
		String maisAlto = null;
		char sexo;
		float porcentagemHomens = 0;
		float porcentagemMulheres = 0; 
		float alturaMediaMulheres = 0;

		System.out.println("Digite a quantidade de Atletas");
		quantidadeDeAtletas = sc.nextDouble();

		for (iCont = 1; iCont <= quantidadeDeAtletas; iCont = iCont + 1) {
			//System.out.println("Qual o Nome do Atleta:");
			//name = sc.nextLine();

			//sc.nextLine();

			System.out.println("Digite o sexo :");
			sexo = sc.next().charAt(0);

			//System.out.println("Digite a Altura:");
			//altura = sc.nextDouble();

	//		System.out.println("Digite o Peso");
		//	peso = sc.nextDouble();

		//	if (altura < 0) {
			//	System.out.println("Digite uma altura válida");
				//altura = sc.nextDouble();
			//}

			//if (peso < 0) {
				//System.out.println("Digite uma altura válida");
				//altura = sc.nextDouble();
			//}

			//if (((sexo != 'M') || (sexo != 'm') || (sexo != 'F') || (sexo != 'f'))) {
				//System.out.println("Digite um Sexo Válido");
				//sexo = sc.next().charAt(0);
			//}
			//	somaMediaPeso = somaMediaPeso + peso;
			//	pesoMedio = (somaMediaPeso/quantidadeDeAtletas);
		
			if (sexo == 'm') {
				
				quantidadeDeHomens = quantidadeDeHomens + 1;
				porcentagemHomens = (float) ((quantidadeDeHomens*100) / quantidadeDeAtletas); 
			} 
			else {
				porcentagemMulheres = porcentagemMulheres +1;  
			}
		}

	//	System.out.println("RELATÓRIO:");
	//	System.out.println("Peso Médio dos Atletas: " + pesoMedio);
		//System.out.println("Atleta Mais Alto é: " + maisAlto);
		System.out.printf("Porcetagem de Homens %.f" ,porcentagemHomens );
	//	System.out.println("Altura Média Mulheres" + alturaMediaMulheres);

		sc.close();
	}
}
