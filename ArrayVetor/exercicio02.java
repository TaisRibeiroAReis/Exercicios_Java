package ArrayVetor;
import java.util.Scanner;

/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/
public class exercicio02 
{

	 public static void main(String[]args) 
	 {
		 
		 int [] numeros = new int [6]; 
		 int somaImp=0,somaPar=0,numero;	
		 
		  Scanner leia = new Scanner(System.in);
		 
		   for (numero=0;numero<6;numero++)
		   {
			  System.out.println("\nDigite um Número: ");
			  numeros [numero] = leia.nextInt();
		 
		   }	
			  System.out.println("\nNúmeros pares digitados: ");
			
			for (numero=0;numero<6;numero++)
			{
			
			
				if (numero % 2 == 0)
			    {
				System.out.println(numeros[numero]);
				somaPar += numeros[numero];
			 
			    }
			 }
	      
			System.out.println("\nA soma dos números pares foi: " + somaPar);
			System.out.println("\nValores ímpares digitados: " );
			
			for (numero=0;numero<6;numero++)
			{
				if (numeros [numero] % 2 == 1 )
				{
					System.out.println(numeros [numero]);
					somaImp += numeros [numero];
				}
			}
		   System.out.println("\nA soma dos números ímpar foi: " +somaImp);
			 
	 }
	
   
	 
   	 
}
