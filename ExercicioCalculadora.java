import java.util.Scanner;

public class ExercicioCalculadora {

	public static void main(String[] args) {
	
		// Inicializa��o das vari�veis. 
		
		float n1 = -999, n2 = -999, resultado = 0; 
		
		char operacao = '+';
		
		Scanner entrada = new Scanner(System.in); 
	
		// Bloco principal.
		System.out.println("=-=-==-=-= Calculadora =-=-==-=-=");
		do {  
			
			
			// Reseta a validade do resultado. 
			boolean resultadoValido = true; 
			
			// Input do primeiro n�mero. 
			System.out.println("\nInforme um n�mero (-999 para parar): ");
			n1 = entrada.nextInt(); 
			
			// Decis�o: s� segue com c�digo se o primeiro n�mero for diferente de -999. Para poupar tempo. 
			if(n1 != -999) { 
				
				//Input do segundo n�mero. 
				System.out.println("\nInforme o segundo n�mero: ");
				n2 = entrada.nextInt();

				//Input da opera��o. 
				System.out.println("\nQual ser� a opera��o? (+, -, /, x)");
				operacao = entrada.next().charAt(0); 
				
				//Decis�o do resultado baseado na opera��o escolhida. 
				switch (operacao) { 
					case '+': 
						resultado = n1 + n2; 
						break;
					case '-': 
						resultado = n1 - n2; 
						break;
					case '/': 
						if(n2 == 0) {
							System.out.println("Opera��o imposs�vel. O divisor n�o pode ser 0.");
							resultadoValido = false;
						} else {
							resultado = n1 / n2;
						}
						break;
					case 'x':
						resultado = n1 * n2; 
						break;
					default: 
						System.out.println("Opera��o inv�lida.");
						resultadoValido = false;
				}
				
				// Impress�o do resultado: somente se for v�lido. 
				if(resultadoValido) {
					System.out.println("\nResultado = "+ resultado);
					
					if(resultado > 0) {
						System.out.println("Resultado maior que zero.");
					} else if(resultado < 0) {
						System.out.println("Resultado menor que zero. ");
					} else {
						System.out.println("Resultado igual a zero.");
					}
					
					System.out.println(resultado % 2 == 0 ? "Par. " : "Impar. ");
				} else {
					System.out.println("Resultado inv�lido.");
				}
			}
			
		} while (n1 != -999 && n2 != -999); // Condi��o de parada. 
		
		System.out.println("\nPrograma encerrado.");
		
		entrada.close();
		
	}

}
