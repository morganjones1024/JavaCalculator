public class Calculator {
	

	public static void add(double a, double b) {
		double answer = a + b;
		System.out.println(answer);
	}

	public static void subtract(double a, double b) {
		double answer = a - b;
		System.out.println(answer);
	}

	public static void divide(double a, double b) {
		double answer = a / b;
		System.out.println(answer);
	}

	public static void square(double a, double b) {
		double answer = Math.pow(a, b);
		System.out.println(answer);
	}

	public static void main(String[] args) {
		add(10, 4);
	}
}

