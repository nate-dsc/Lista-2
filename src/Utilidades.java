import java.util.Random;

public class Utilidades {

	//questao 1
	float somatorio(float vet[])
	{
		float soma = 0;
		if (vet.length <= 4)
		{
			return soma;
		}
		else
		{
			for (int i = 2; i < vet.length - 2; i++)
			{
				soma += vet[i];
			}
			return soma;
		}
	}
	
	//questao 2
	void pares(int ini, int fim)
	{
		int par;
		if (ini % 2 == 1)
		{
			par = ini + 1;
		}
		else
		{
			par = ini + 2;
		}
		while (par < fim)
		{
			System.out.println(par);
			par += 2;
		}
	}
	
	//questao 3
	float media(float a[], float b[])
	{
		float soma = 0;
		for (int i = 0; i < a.length; i++)
		{
			soma += a[i];
		}
		for (int i = 0; i < b.length; i++)
		{
			soma += b[i];
		}
		soma = soma/(a.length + b.length);
		return soma;
	}
	
	//questao 4
	float mediaPonderada(float vet[], float peso[])
	{
		float media = 0;
		if (vet.length == peso.length)
		{
			for (int i = 0; i < vet.length; i++)
			{
				media = media + vet[i]*peso[i];
			}
			media = media/vet.length;
		}
		return media;
	}
	
	//questao 5
	int contagem(int a[], int b[], int c)
	{
		int contador = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == c)
			{
				contador++;
			}
		}
		for (int i = 0; i < b.length; i++)
		{
			if (b[i] == c)
			{
				contador++;
			}
		}
		return contador;
	}
	
	//questao 6
	float[] copia(float[] vet)
	{
		return vet;
	}
	
	//questao 7
	float[] ordenar(float[] vet)
	{
		float[] ord = vet;
		float passe;
		for (int i = 0; i < ord.length; i++)
		{
			for (int j = 1; j < ord.length; j++)
			{
				if (ord[j] < ord[j-1])
				{
					passe = ord[j-1];
					ord[j-1] = ord [j];
					ord[j] = passe;
				}
			}
		}
		return ord;
	}

	//questao 8
	boolean estaOrdenado(float[] vet)
	{
		boolean ordenado = true;
		for (int i = 0; i < vet.length - 1; i++)
		{
			if (vet[i] > vet[i+1])
			{
				ordenado = false;
			}
		}
		return ordenado;
	}
	
	//questao 9
	float kmaior(float[] vet, int k)
	{
		Utilidades u = new Utilidades();
		return u.ordenar(vet)[vet.length - k];
	}
	
	//questao 10
	float kmenor(float[] vet, int k)
	{
		Utilidades u = new Utilidades();
		return u.ordenar(vet)[k-1];
	}

	//questao 11
	boolean igual(float[] a, float[] b)
	{
		boolean igual = true;
		if (a.length == b.length)
		{
			for (int i = 0; i < a.length; i++)
			{
				if (a[i] != b[i])
				{
					igual = false;
				}
			}
		}
		else
		{
			igual = false;
		}
		return igual;
	}
	
	//questao 12
	double exp(double a, int b)
	{
		double resultado = 0;
		if (b == 0) resultado = 1;
		if (b < 0) resultado = exp(1/a, -b);
		if (b > 0)
		{
			resultado = a*exp(a, b-1);
		}
		return resultado;
	}
	
	//questao 13
	boolean primo(int a)
	{
		boolean primo = true;
		if (a < 0) primo = false;
		else
		{
			for (int i = 2; i < a/2; i++)
			{
				if (a%i == 0) primo = false;
			}
		}
		return primo;
		
	}
	
	//questao 14
	int[] ocorrencia(int[] a, int[] b)
	{
		int[] prov = new int[a.length + b.length];
		
		for(int i = 0; i < a.length; i++)
		{
			prov[i] = a[i];
		}
		
		for(int i = 0; i < b.length; i++)
		{
			prov[a.length + i] = b[i];
		}
		
		
		
		return prov;
	}
	
	//questao 15
	int[] removerElemento(int[] a, int b)
	{
		int[] mapa = new int[a.length];
		int contador = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(b == a[i])
			{
				mapa[i] = 1;
			}
			else
			{
				mapa[i] = 0;
				contador++;
			}
		}
		int[] resultado = new int[contador];
		int indice = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(mapa[i] == 0)
			{
				resultado[indice] = a[i];
				indice++;
			}
		}
		return resultado;
	}
	
	//questao 16
	boolean palindromo(String str)
	{
		char[] cstr = new char[str.length()];
		cstr = str.toCharArray();
		
		char[] crev = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++)
		{
			crev[i] = str.charAt(str.length() - i - 1);
		}
		
		boolean flag = true;
		for(int i = 0; i < cstr.length; i++)
		{
			if(cstr[i] != crev[i])
			{
				flag = false;
			}
		}
		
		return flag;
	}
	
	//questao 17
	boolean verificarPrimo(int a)
	{
		{
			boolean primo = true;
			if (a < 0) primo = false;
			else
			{
				for (int i = 2; i < a/2; i++)
				{
					if (a%i == 0) primo = false;
				}
			}
			return primo;
			
		}
	}
	
	//questao 18
	String inverter(String str)
	{
		char[] crev = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++)
		{
			crev[i] = str.charAt(str.length() - i - 1);
		}
		
		String resultado = new String(crev);
		return resultado;
	}

	//questao 19
	double jurosCompostos(double inicial, double taxa, double periodos)
	{
		double resultado;
		resultado = inicial*Math.pow(1 + taxa, periodos);
		return resultado;
	}

	//questao 20
	boolean numeroPerfeito(int n)
	{
		int soma = 0;
		for(int i = 1; i <= n/2; i++)
		{
			if(n%i == 0)
			{
				soma += i;
			}
		}
		
		if(soma == n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//questao 21
	int[] diminuirVetor(int i)
	{
		int[] vet = new int[i];
		
		Random rnd = new Random();
		
		for(int j = 0; j < vet.length; j++)
		{
			vet[j] = rnd.nextInt();
		}
		
		while(diminuirVetor(vet).length > 1)
		{
			vet = diminuirVetor(vet);
		}
		
		return vet;
	}
	
	int[] diminuirVetor(int[] i)
	{
		int[] vet = new int[i.length - 1];
		
		for(int j = 0; j < vet.length; j++)
		{
			vet[j] = i[j];
		}
		
		return vet;
	}
	
	//questao 22
	void imprimirElementos(int L)
	{
		for(int i = 0; i < L; i++)
		{
			for(int j = 0; j < L; j++)
			{
				if(i >= j)
				{
					System.out.print((char)(j + '0') + " ");
				}
				else
				{
					System.out.print("  ");
				}	
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = 0; i < L; i++)
		{
			for(int j = 0; j < L; j++)
			{
				if((i+j)%2 == 0)
				{
					System.out.print("@ ");
				}
				else
				{
					System.out.print("* ");
				}	
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = 1; i <= L; i++)
		{
			for(int j = 1; j <= L; j++)
			{
				if(i == (L+1)/2 || j == (L+1)/2)
				{
					System.out.print("@ ");
				}
				else if(i%2 == 1)
				{
					System.out.print((char)(L - j + '0') + " ");
				}
				else
				{
					System.out.print((char)(j + '0') + " ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = 1; i <= L; i++)
		{
			for(int j = 1; j <= L; j++)
			{
				if(i == 1)
				{
					System.out.print((char)(j - 1 + '0') + " ");
				}
				else if(i == L)
				{
					System.out.print((char)(L - j + '0') + " ");
				}
				else if(j == 1)
				{
					System.out.print((char)(i - 1 + '0') + " ");
				}
				else if(j == L)
				{
					System.out.print((char)(L - i + '0') + " ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = 1; i <= L; i++)
		{
			for(int j = 1; j <= L; j++)
			{
				if(j == (L+1)/2)
				{
					System.out.print("||");
				}
				else if(i == (L+1)/2)
				{
					System.out.print("= ");
				}
				else
				{
					if(i > (L+1)/2)
					{
						if(j > (L+1)/2)
						{
							System.out.print("% ");
						}
						else
						{
							System.out.print("* ");
						}
					}
					else
					{
						if(j > (L+1)/2)
						{
							System.out.print("! ");
						}
						else
						{
							System.out.print("# ");
						}
					}
				}
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = 1; i <= L; i++)
		{
			for(int j = 1; j <= L; j++)
			{
				if(i == j || i + j == L + 1)
				{
					System.out.print(j - 1 + " ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}