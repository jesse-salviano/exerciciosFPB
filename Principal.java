
public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Retangulo X: ");
		Retangulo x = new Retangulo();
		
		System.out.println("Retangulo Y: ");
		Retangulo y = new Retangulo();
		
		System.out.println("\nRetangulo X: ");
		System.out.println(x);
		
		System.out.println("\nRetangulo Y: ");
		System.out.println(y);
		
		x.compararArea(y);

	}

}
