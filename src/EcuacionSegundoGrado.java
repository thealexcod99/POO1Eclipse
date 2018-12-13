
public class EcuacionSegundoGrado {

	private float a;
	private float b;
	private float c;
	
	public EcuacionSegundoGrado(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}
	
	public boolean esResoluble() {
		return b * b - 4 * a * c >= 0;
	}
	
	public float calcularX1() {
		return (float) ((b + Math.sqrt(b * b - 4 * a * c)) / 2 * a);
	}
	
	public float calcularX2() {
		return (float) ((-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a);
	}

	@Override
	public String toString() {
		return "EcuacionSegundoGrado [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
