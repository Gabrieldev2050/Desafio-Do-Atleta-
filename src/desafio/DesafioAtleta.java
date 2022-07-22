package desafio;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAtleta {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);

			int iCont;
			double quantidadeDeHomens = 0;
			double quantidadeMulheres = 0;
			double quantidadeDeAtletas;
			double altura;
			double somaAlturaMulheres = 0;
			double peso;
			double somaMediaPeso = 0;
			double pesoMedio = 0;
			double alturaMediaMulheres = 0;
			double alturaAtual = 0;
			String name;
			String atletaMaisAlto = null;
			String maisAlto = null; 
			char sexo;
			double porcentagemHomens = 0;
			double porcentagemMulheres = 0;

			System.out.println("Digite a quantidade de Atletas");
			quantidadeDeAtletas = sc.nextDouble();
			
			sc.nextLine();
			
			for (iCont = 1; iCont <= quantidadeDeAtletas; iCont = iCont + 1) {
				System.out.println("Qual o Nome do Atleta:");
				name = sc.nextLine();
								
				System.out.println("Digite o sexo :");
				sexo = sc.next().charAt(0);

				if ((sexo == 'F') || (sexo == 'M')|| (sexo == 'f') || (sexo == 'm')) {
				} 
				
				else  {System.out.println ("Sexo Invalido! Digite F ou M"); 
				sexo = sc.next().charAt(0);
				}

				System.out.println("Digite a Altura:");
				altura = sc.nextDouble();

				if (altura < 0) {
					System.out.println(" Altura Inválida! Digite uma altura valida");
					altura = sc.nextDouble();
				}

				System.out.println("Digite o Peso");
				peso = sc.nextDouble();

				if (peso <= 0) {
					System.out.println(" Peso Inválida! Digite um peso válido");
					altura = sc.nextDouble();
				}

				somaMediaPeso = somaMediaPeso + peso;
				pesoMedio = (somaMediaPeso / quantidadeDeAtletas);

				if ((sexo == 'm') || (sexo == 'M')) {
					quantidadeDeHomens = quantidadeDeHomens + 1;
					porcentagemHomens =  (quantidadeDeHomens * 100) / quantidadeDeAtletas;
				} else {
					porcentagemMulheres = porcentagemMulheres + 1;
				}

				if ((sexo == 'f') || (sexo == 'F')) {
					quantidadeMulheres = quantidadeMulheres + 1;
					somaAlturaMulheres = somaAlturaMulheres + altura;
					alturaMediaMulheres = (somaAlturaMulheres / quantidadeMulheres);

					if (alturaMediaMulheres == 0) {
						System.out.println("Não Há Mulheres na Equipe");
					}
				}

				if (alturaAtual < altura) {
					alturaAtual =  altura;
					maisAlto = name;
				}
				atletaMaisAlto = maisAlto; 		
				sc.nextLine();
			}
			
			
			System.out.println("RELATÓRIO:");
			System.out.printf("Peso Médio dos Atletas: %.2f%n ",pesoMedio);
			System.out.println("Atleta Mais Alto é: " + atletaMaisAlto);
			System.out.printf("Porcetagem de Homens %.2f%%%n",porcentagemHomens);
			System.out.println("Altura Média Mulheres" + alturaMediaMulheres);

			sc.close();
		}
	}
}
