public class App {
	
	public static void main(String[] args) {
		Modelagens m = new Modelagens();
		//Exerc�cio 1
		//System.out.println(m.fatorial(5));
		
		//Exerc�cio 2
//		System.out.println(m.somatorio(-3));
//		System.out.println(m.somatorio(3));
		
		//Exerc�cio 3
		for (int i = 1; i <= 100; i++) {
		System.out.println(i + ": " + m.fibonacci(i));
		}
	}

}
