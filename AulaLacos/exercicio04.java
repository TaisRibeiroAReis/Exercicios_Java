package AulaLacos;
import java.util.Scanner;

/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado. */
	
public class exercicio04 
{

		public static void main(String[] args)
		{
			int numero;
			double result;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite um N�mero:");
			numero = leia.nextInt();
			
			if (numero % 2 == 0)
			{
				result = Math.sqrt(numero);
			}
			else
			{
				 result = Math.pow(numero, 2);
			}
			System.out.println("\nResultado: "+result);
		}

}
