import java.util.Scanner;

public class Retangulo {
	
	Scanner entrada = new Scanner(System.in);
	
	//Atributos
	public double largura;
	public double altura;
	
	//M�todo construtor
	public Retangulo() {
	System.out.println("Informe a largura: ");
	largura = entrada.nextDouble();
	
	System.out.println("Informe a altura: ");
	altura = entrada.nextDouble();
	
	}
	
	//M�todos
	
	//Area
	public double area() {
		return (this.altura * this.largura);
	}
	
	//Per�metro
	public double perimetro() {
		return ((this.largura + this.altura) * 2);
	}
	
	// Diagonal
	public double diagonal() {
		return (Math.sqrt(this.largura * this.largura + this.altura * this.altura));
	}
	
	//Comparar
	public void compararArea(Retangulo b) {
		System.out.println(b.area() >= this.area() ? "\nA �rea do segundo retangulo � maior." : "\nA �rea do primeiro retangulo � maior.");
	}
	
	//M�todo toString
	public String toString() {
		return("\nAltura: " + this.altura + "\nLargura: " + this.largura + "\n�rea: " + this.area() + "\nPer�metro: " + this.perimetro() + "\nDiagonal: " + String.format("%.2f", this.diagonal()));
	};
}
