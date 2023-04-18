import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		//Declarando variáveis: 
		Scanner entrada = new Scanner(System.in);
		float soma = 0, media = 0;
		
		//Definindo tamanho do array e instanciando: 
		System.out.println("Informe a quantidade de notas: ");
		int qtdNotas = entrada.nextInt();
		float[] notas = new float[qtdNotas];
		
		//Incluindo valores no array: 
		for(int i = 0; i < qtdNotas; i++) {
			System.out.println("\nInforme a " + (i + 1) + "ª nota.");
			notas[i] = entrada.nextFloat();
			soma += notas[i];
			media = soma/(i+1);
		}
		
		//Imprimindo as notas: 
		System.out.println("[-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-]\n");
		for(int i = 0; i < qtdNotas; i++) {
			System.out.println("Nota "+ (i+1) + ": " + notas[i]);
		}
		System.out.println("\nMédia: " + (media));
		
		//Definindo se foi aprovado ou não: 
		System.out.println(media >= 7 ? "Aprovado!" : "Reprovado!");
		entrada.close();
	}
}
