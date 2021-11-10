package AulaLacos;
import java.util.Scanner;

/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. */
	
public class exercicio04 
{

		public static void main(String[] args)
		{
			int numero;
			double result;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite um Número:");
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
