package ArrayVetor;
import java.util.Scanner;

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/
public class exercicio02 
{

	 public static void main(String[]args) 
	 {
		 
		 int [] numeros = new int [6]; 
		 int somaImp=0,somaPar=0,numero;	
		 
		  Scanner leia = new Scanner(System.in);
		 
		   for (numero=0;numero<6;numero++)
		   {
			  System.out.println("\nDigite um N�mero: ");
			  numeros [numero] = leia.nextInt();
		 
		   }	
			  System.out.println("\nN�meros pares digitados: ");
			
			for (numero=0;numero<6;numero++)
			{
			
			
				if (numero % 2 == 0)
			    {
				System.out.println(numeros[numero]);
				somaPar += numeros[numero];
			 
			    }
			 }
	      
			System.out.println("\nA soma dos n�meros pares foi: " + somaPar);
			System.out.println("\nValores �mpares digitados: " );
			
			for (numero=0;numero<6;numero++)
			{
				if (numeros [numero] % 2 == 1 )
				{
					System.out.println(numeros [numero]);
					somaImp += numeros [numero];
				}
			}
		   System.out.println("\nA soma dos n�meros �mpar foi: " +somaImp);
			 
	 }
	
   
	 
   	 
}
