import java.util.Scanner;

public class TestEcuacionSegundoGrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor a: ");
		float a = sc.nextFloat();
		System.out.println("Introduce el valor b: ");
		float b = sc.nextFloat();
		System.out.println("Introduce el valor c: ");
		float c = sc.nextFloat();
		
		EcuacionSegundoGrado e = new EcuacionSegundoGrado( a, b, c);

	}

}
