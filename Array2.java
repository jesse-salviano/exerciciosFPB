import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		
		//Instanciando variáveis.
		Scanner entrada = new Scanner(System.in);
		int[] A = new int[5];
		
		//Populando o array A.
		for(int i = 0; i < A.length ; i++) {
			System.out.println("Informe um número.");
			A[i] = entrada.nextInt();
		}
		
		//Instanciando o array B (cópia do array A).
		//int[] B = A;
		
		//Imprimindo array A e populando array B.
		
		int[] B = new int[A.length];
		
		System.out.println("\nArray A: ");
		for(int i = 0; i < A.length ; i ++) {
			System.out.println(i);
			B[i] = A[i];
		}
		
		//Imprimindo array B.
		System.out.println("\nArray B: ");
		for(int i: B) {
			System.out.println(i);
		}
		
		entrada.close();
	}
}
