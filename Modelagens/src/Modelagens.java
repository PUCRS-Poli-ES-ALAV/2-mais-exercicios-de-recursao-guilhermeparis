public class Modelagens {
/*Exercícios de recursão adicional
Modele as recursões, e depois implemente cada um dos algorítmos modelados.
Faça uma classe contendo os métodos implementados.
Coloque a modelagem como comentário antes de cada método.
Extra: terminados estes exercícios, modele e implemente (se ainda não concluiu) os exercícios de re-aquecimento.

	1. Modele e implemente um método recursivo que calcule o fatorial de um número n passado como parâmetro.
	
	Modelagem:
	int fatorial (int n)
	Exs: n = -1, n = 0, n = 1, n = 5
	Situações de Erro: n < 0 -> Exception
	Situação de parada n == 0 -> 1
	(base da recursão) n == 1 -> 1
	Recursão: n >= 2 (para todos os inteiros positivos iguais ou maiores que 2.
	n == 2 -> 2 * fatorial(1)
	n == 5 -> 5 * fatorial(4)
	*/
	
	public int fatorial(int n) {
		//Situações de erro
		if (n < 0)
			throw new IllegalArgumentException("Error: negative number");
		//Base da recursão
		if (n==0 || n==1)
			return 1;
		//Recursão
		else
			return n * fatorial(n-1);
	}
	
	/* 2. Modele e implemente um método recursivo que calcule o somatório de um número n passado como parâmetro até 0 (inclusive para números negativos).
	
	Modelagem:
	int somatorio (int n)
	Exs: n = -1, n = 0, n = 1, n = 10
	Situações de Erro: Não há
	Situação de parada (base da recursão) n == 0 -> 0
	Recursão:  
	n == 5 -> 5 + somatorio(4)
	n == 1 -> 1 + somatorio(0)
	n == -3 -> -3 + somatório(-2)
	*/
	
	public int somatorio (int n){
		//Situações de erro: não há
		//Base da recursão:
		if (n==0) 
			return 0;
		else if (n < 0)
			return n + somatorio(n+1);
		else
			return n + somatorio(n-1);
	}
	
	/* 3. Modele e implemente um método recursivo que calcule o n-ésimo número da sequência de fibonacci.
	
	Modelagem:
	int fibonacci(int n)
	Exs: n = -1, n = 0, n = 1, n = 5
	Situações de Erro: n <= 0 -> Exception
	Situação de parada n == 2 -> 1
	(base da recursão) n == 1 -> 1
	Recursão:  
	n == 5 -> fibonacci(4) + fibonacci (3)
	n == 3 -> fibonacci(3) + fibonacci (2)
	*/
	
	public int fibonacci (int n){
		//Situações de erro:
		if (n<0)
			throw new IllegalArgumentException("Error: negative number");
		//Base da recursão:
		if (n==2 || n==1) 
			return 1;
		else
			return fibonacci(n-2) + fibonacci(n-1);
	}
	

	/*. 4 Modele e implemente um método recursivo que calcule o somatório dos números inteiros entre os números k e j, passados como parâmetro.
	
	Modelagem
	int somatorio(int k, int j)
	Exs: n = -4, n = 0, n = 1, n = 5
	Situações de Erro: Não há
	Situação de parada (base da recursão): k == j
	Recursão:  
	k == 2 e j == 6 -> 2 + somatorio(3)
	k == 6 e j == 2 -> 6 + somatorio(5)
	k == -4 e j == -7 -> -4 + somatorio(-5)
	k == -7 e j == -4 -> -7 + somatorio(-6)
	*/
	
	public int somatorio(int k, int j) {
		//Condição de parada
		if (k==j)
			return k;
		else if (k < j)
			return k + somatorio(k+1, j);
		else
			return j + somatorio(k, j+1);
	}
	
	/* 5.Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.
	 
	Modelagem
	boolean isPal(String s)
	Exs: S == vazio, S == null, S == arara, S = batata
	Situações de Erro: String nula
	Situação de parada (base da recursão): String na posição 0 == String na posição length-1
	Recursão:  
	S == arara -> a == a
	S == rar -> r == r
	S == a -> a == a
	*/
	
	public boolean isPal(String s) {
		boolean res;
		//Situação de erro
		if (s == null)
			throw new IllegalArgumentException("Error: Null string");
		//Bases da recursão
		else if ((s.length() == 0) || (s.length() == 1))
			res = true;
		else if (s.charAt(0) != s.charAt(s.length()-1))
			res = false;
		//Recursão:
		else
			res = isPal(s.substring(1, s.length()-1));
		//Fim da recursão e retorno do método:
		return res;
	}
	
	/* 6. Modele e implemente um método recursivo que recebe um inteiro zero ou positivo e retorna um String com o número em binário.	
	Modelagem
	String convBase2(int n)
	Exs: n = -5, n = 0, n = 1, n = 4
	Situações de Erro: n < 0
	Situação de parada (base da recursão): n == 0 -> 0
	Recursão:  
	n == 25 -> convBase(n % 2)
	*/
	
	public String convBase2(int n){
		String S = "";
		//Situação de Erro
		if (n < 0)
			throw new IllegalArgumentException("Error: negative number");
		//Base da recursão
		if (n == 0)
			S = "0";
		if (n == 1)
			S = "1";
		else
			S = convBase2(n / 2) + n % 2;
		return S;
			
	}
	
}



// Modele e implemente um método recursivo que calcule o somatório dos números contidos em um ArrayList de inteiros, passado como parâmetro.
//
//	Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.
//
//	     int findBiggest(ArrayList<Integer> ar) 
//	Implemente um método recursivo para determinar se um string ocorre dentro de outro.
//
//	   boolean findSubStr(String str, String match)
//	Faça um método recursivo que determina o número de dígitos de um inteiro.
//
//	   int nroDigit(int n)
//	Implemente um métodos que recebe um String e retorna um ArrayList com todas as permutações deste String.
//
//	   ArrayList<String> permutations(String s)