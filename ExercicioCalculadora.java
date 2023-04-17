import java.util.Scanner;

public class ExercicioCalculadora {

	public static void main(String[] args) {
	
		// Inicialização das variáveis. 
		
		float n1 = -999, n2 = -999, resultado = 0; 
		
		char operacao = '+';
		
		Scanner entrada = new Scanner(System.in); 
	
		// Bloco principal.
		System.out.println("=-=-==-=-= Calculadora =-=-==-=-=");
		do {  
			
			
			// Reseta a validade do resultado. 
			boolean resultadoValido = true; 
			
			// Input do primeiro número. 
			System.out.println("\nInforme um número (-999 para parar): ");
			n1 = entrada.nextInt(); 
			
			// Decisão: só segue com código se o primeiro número for diferente de -999. Para poupar tempo. 
			if(n1 != -999) { 
				
				//Input do segundo número. 
				System.out.println("\nInforme o segundo número: ");
				n2 = entrada.nextInt();

				//Input da operação. 
				System.out.println("\nQual será a operação? (+, -, /, x)");
				operacao = entrada.next().charAt(0); 
				
				//Decisão do resultado baseado na operação escolhida. 
				switch (operacao) { 
					case '+': 
						resultado = n1 + n2; 
						break;
					case '-': 
						resultado = n1 - n2; 
						break;
					case '/': 
						if(n2 == 0) {
							System.out.println("Operação impossível. O divisor não pode ser 0.");
							resultadoValido = false;
						} else {
							resultado = n1 / n2;
						}
						break;
					case 'x':
						resultado = n1 * n2; 
						break;
					default: 
						System.out.println("Operação inválida.");
						resultadoValido = false;
				}
				
				// Impressão do resultado: somente se for válido. 
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
					System.out.println("Resultado inválido.");
				}
			}
			
		} while (n1 != -999 && n2 != -999); // Condição de parada. 
		
		System.out.println("\nPrograma encerrado.");
		
		entrada.close();
		
	}

}
