package AulaLacos;
import java.util.Scanner;

/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

public class exercicio01 {
	
	public static void main(String[] args)
	{
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro Numero: ");
		n1 = leia.nextInt();
		
		System.out.println("\nDigite o segundo Numero: ");
		n2 = leia.nextInt();
		
		System.out.println("\nDigite o terceiro Numero: ");
		n3 = leia.nextInt();
		
		if (n1>n2 && n1<n3)
		{
			System.out.println("\nO maior Número é: "+n1);
		}
		else if (n1>n2 && n2<n3)
		{
			System.out.println("\nO maior Número é: "+n2);
		
		}
		else 
		{
			System.out.println("\nO maior Número é: "+n3);
		}
	}

}
