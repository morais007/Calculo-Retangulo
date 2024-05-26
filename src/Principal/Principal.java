// Importar as Classes:
package Principal;
import Retangulo.Retangulo;
import java.util.Scanner;
import java.util.Locale;

// Classe Principal do programa:
public class Principal {

	//Método Main
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Criar o Objeto Retangulo:
		Retangulo ret = new Retangulo();
		
		// Pedir os Valores a ser Calculados:
		System.out.println("Digite as medidas do Retangulo: ");
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();
				
		// Chamar os Métodos:
		ret.area();
		ret.perimetro();
		ret.diagonal();
		
		// Mostrar os Resultados:
		System.out.printf("AREA = %.2f%n" , ret.area());
		System.out.printf("PERIMETRO = %.2f%n" , ret.perimetro());
		System.out.printf("DIAGONAL = %.2f%n" , ret.diagonal());
		
		sc.close();
	}


}
