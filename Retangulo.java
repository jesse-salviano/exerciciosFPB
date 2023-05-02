import java.util.Scanner;

public class Retangulo {
	
	Scanner entrada = new Scanner(System.in);
	
	//Atributos
	public double largura;
	public double altura;
	
	//Método construtor
	public Retangulo() {
	System.out.println("Informe a largura: ");
	largura = entrada.nextDouble();
	
	System.out.println("Informe a altura: ");
	altura = entrada.nextDouble();
	
	}
	
	//Métodos
	
	//Area
	public double area() {
		return (this.altura * this.largura);
	}
	
	//Perímetro
	public double perimetro() {
		return ((this.largura + this.altura) * 2);
	}
	
	// Diagonal
	public double diagonal() {
		return (Math.sqrt(this.largura * this.largura + this.altura * this.altura));
	}
	
	//Comparar
	public void compararArea(Retangulo b) {
		System.out.println(b.area() >= this.area() ? "\nA área do segundo retangulo é maior." : "\nA área do primeiro retangulo é maior.");
	}
	
	//Método toString
	public String toString() {
		return("\nAltura: " + this.altura + "\nLargura: " + this.largura + "\nÁrea: " + this.area() + "\nPerímetro: " + this.perimetro() + "\nDiagonal: " + String.format("%.2f", this.diagonal()));
	};
}
