public class Modelagens {
/*Exerc�cios de recurs�o adicional
Modele as recurs�es, e depois implemente cada um dos algor�tmos modelados.
Fa�a uma classe contendo os m�todos implementados.
Coloque a modelagem como coment�rio antes de cada m�todo.
Extra: terminados estes exerc�cios, modele e implemente (se ainda n�o concluiu) os exerc�cios de re-aquecimento.

	1. Modele e implemente um m�todo recursivo que calcule o fatorial de um n�mero n passado como par�metro.
	
	Modelagem:
	int fatorial (int n)
	Exs: n = -1, n = 0, n = 1, n = 5
	Situa��es de Erro: n < 0 -> Exception
	Situa��o de parada n == 0 -> 1
	(base da recurs�o) n == 1 -> 1
	Recurs�o: n >= 2 (para todos os inteiros positivos iguais ou maiores que 2.
	n == 2 -> 2 * fatorial(1)
	n == 5 -> 5 * fatorial(4)
	*/
	
	public int fatorial(int n) {
		//Situa��es de erro
		if (n < 0)
			throw new IllegalArgumentException("Error: negative number");
		//Base da recurs�o
		if (n==0 || n==1)
			return 1;
		//Recurs�o
		else
			return n * fatorial(n-1);
	}
	
	/* 2. Modele e implemente um m�todo recursivo que calcule o somat�rio de um n�mero n passado como par�metro at� 0 (inclusive para n�meros negativos).
	
	Modelagem:
	int somatorio (int n)
	Exs: n = -1, n = 0, n = 1, n = 10
	Situa��es de Erro: N�o h�
	Situa��o de parada (base da recurs�o) n == 0 -> 0
	Recurs�o:  
	n == 5 -> 5 + somatorio(4)
	n == 1 -> 1 + somatorio(0)
	n == -3 -> -3 + somat�rio(-2)
	*/
	
	public int somatorio (int n){
		//Situa��es de erro: n�o h�
		//Base da recurs�o:
		if (n==0) 
			return 0;
		else if (n < 0)
			return n + somatorio(n+1);
		else
			return n + somatorio(n-1);
	}
	
	/* 3. Modele e implemente um m�todo recursivo que calcule o n-�simo n�mero da sequ�ncia de fibonacci.
	
	Modelagem:
	int fibonacci(int n)
	Exs: n = -1, n = 0, n = 1, n = 5
	Situa��es de Erro: n <= 0 -> Exception
	Situa��o de parada n == 2 -> 1
	(base da recurs�o) n == 1 -> 1
	Recurs�o:  
	n == 5 -> fibonacci(4) + fibonacci (3)
	n == 3 -> fibonacci(3) + fibonacci (2)
	*/
	
	public int fibonacci (int n){
		//Situa��es de erro:
		if (n<0)
			throw new IllegalArgumentException("Error: negative number");
		//Base da recurs�o:
		if (n==2 || n==1) 
			return 1;
		else
			return fibonacci(n-2) + fibonacci(n-1);
	}
	

	/*. 4 Modele e implemente um m�todo recursivo que calcule o somat�rio dos n�meros inteiros entre os n�meros k e j, passados como par�metro.
	
	Modelagem
	int somatorio(int k, int j)
	Exs: n = -4, n = 0, n = 1, n = 5
	Situa��es de Erro: N�o h�
	Situa��o de parada (base da recurs�o): k == j
	Recurs�o:  
	k == 2 e j == 6 -> 2 + somatorio(3)
	k == 6 e j == 2 -> 6 + somatorio(5)
	k == -4 e j == -7 -> -4 + somatorio(-5)
	k == -7 e j == -4 -> -7 + somatorio(-6)
	*/
	
	public int somatorio(int k, int j) {
		//Condi��o de parada
		if (k==j)
			return k;
		else if (k < j)
			return k + somatorio(k+1, j);
		else
			return j + somatorio(k, j+1);
	}
	
	/* 5.Modele e implemente um m�todo recursivo que recebe um String em retorna true se este String for um pal�ndrome, false caso contr�rio.
	 
	Modelagem
	boolean isPal(String s)
	Exs: S == vazio, S == null, S == arara, S = batata
	Situa��es de Erro: String nula
	Situa��o de parada (base da recurs�o): String na posi��o 0 == String na posi��o length-1
	Recurs�o:  
	S == arara -> a == a
	S == rar -> r == r
	S == a -> a == a
	*/
	
	public boolean isPal(String s) {
		boolean res;
		//Situa��o de erro
		if (s == null)
			throw new IllegalArgumentException("Error: Null string");
		//Bases da recurs�o
		else if ((s.length() == 0) || (s.length() == 1))
			res = true;
		else if (s.charAt(0) != s.charAt(s.length()-1))
			res = false;
		//Recurs�o:
		else
			res = isPal(s.substring(1, s.length()-1));
		//Fim da recurs�o e retorno do m�todo:
		return res;
	}
	
	/* 6. Modele e implemente um m�todo recursivo que recebe um inteiro zero ou positivo e retorna um String com o n�mero em bin�rio.	
	Modelagem
	String convBase2(int n)
	Exs: n = -5, n = 0, n = 1, n = 4
	Situa��es de Erro: n < 0
	Situa��o de parada (base da recurs�o): n == 0 -> 0
	Recurs�o:  
	n == 25 -> convBase(n % 2)
	*/
	
	public String convBase2(int n){
		String S = "";
		//Situa��o de Erro
		if (n < 0)
			throw new IllegalArgumentException("Error: negative number");
		//Base da recurs�o
		if (n == 0)
			S = "0";
		if (n == 1)
			S = "1";
		else
			S = convBase2(n / 2) + n % 2;
		return S;
			
	}
	
}



// Modele e implemente um m�todo recursivo que calcule o somat�rio dos n�meros contidos em um ArrayList de inteiros, passado como par�metro.
//
//	Modele e implemente um m�todo recursivo para encontrar o maior elemento de um ArrayList.
//
//	     int findBiggest(ArrayList<Integer> ar) 
//	Implemente um m�todo recursivo para determinar se um string ocorre dentro de outro.
//
//	   boolean findSubStr(String str, String match)
//	Fa�a um m�todo recursivo que determina o n�mero de d�gitos de um inteiro.
//
//	   int nroDigit(int n)
//	Implemente um m�todos que recebe um String e retorna um ArrayList com todas as permuta��es deste String.
//
//	   ArrayList<String> permutations(String s)