package Retangulo;

public class Retangulo {
	
	// Declaração dos atributos:
	 public double largura ;
	 public double altura ;
	
	 //Método que calcula a Area do retangulo:
	public double area() {
		return  largura * altura;
		 
	}
	
	 //Método que calcula a Perimetro do retangulo:
	public double perimetro() {
		return  2 * (largura + altura) ;
	
	}
	
	 //Método que calcula a Diagonal do retangulo:
	public double diagonal() {
		return Math.sqrt((largura * largura) + (altura * altura));
		  
		
	}

	
}
