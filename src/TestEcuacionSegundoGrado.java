import java.util.Scanner;

public class TestEcuacionSegundoGrado {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Solucionador de ecuaciones de 2º grado.");
		System.out.println("Forma de la ecuación: ax² + bx + c = 0");
		System.out.println("");
		
		System.out.print("Introduce el valor a: ");
		float a = sc.nextFloat();
		System.out.print("Introduce el valor b: ");
		float b = sc.nextFloat();
		System.out.print("Introduce el valor c: ");
		float c = sc.nextFloat();
		
		sc.close();
		
		EcuacionSegundoGrado e = new EcuacionSegundoGrado( a, b, c);
		
		if (! e.esResoluble()) {
			System.out.println("La ecuación no es resoluble.");
			System.exit(1);
		}
		
		if (e.calcularX1() == e.calcularX2())
			System.out.println("La solución es x = " + e.calcularX1());
		else
			System.out.println("La solución de la ecuación es x1 = " + e.calcularX1() + " y x2 = " + e.calcularX2());
		
	}

}
