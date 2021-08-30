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
		
}
//	Modele e implemente um m�todo recursivo que calcule o somat�rio dos n�meros inteiros entre os n�meros k e j, passados como par�metro.
//
//	Modele e implemente um m�todo recursivo que recebe um String em retorna true se este String for um pal�ndrome, false caso contr�rio.
//
//	     boolean isPal(String s) 
//	Modele e implemente um m�todo recursivo que recebe um inteiro zero ou positivo e retorna um String com o n�mero em bin�rio.
//
//	     String convBase2(int n) 
//	Modele e implemente um m�todo recursivo que calcule o somat�rio dos n�meros contidos em um ArrayList de inteiros, passado como par�metro.
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
