
public class Lista2 {

	public static void main(String[] args) {
		
		int a[] = {1, 1, 3, 4, 6, 7, 1, 1, 1};
		
		Utilidades u = new Utilidades();
		
		for(int i = 0; i < u.removerElemento(a, 1).length; i++)
		{
			System.out.println(u.removerElemento(a, 1)[i]); 
		}
		
		String str = new String();
		str = "Hello World!";
		
		System.out.println(u.inverter(str));
		
		System.out.println(u.jurosCompostos(1000, 0.05, 5));
		
		System.out.println(u.numeroPerfeito(28));
		
		System.out.println(u.diminuirVetor(5)[0]);
		
		u.imprimirElementos(7);
	}
}
