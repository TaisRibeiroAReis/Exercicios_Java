package ArrayVetor;
import java.util.Scanner;

public class exercicio03Matriz {

	public static void main(String[]args) {
		
		int [][] contMaior = new int [3][3];
		int linha,coluna,cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (linha=0;linha<3;linha++)
		{
		  for(coluna=0;coluna<3;coluna++)
		  {
			  System.out.println("\nDigite um Número");
			  contMaior [linha][coluna] = leia.nextInt();
		  }
		}
		
		System.out.println("\nO Resultado da Matriz maior que 10 é: ");   
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				if (contMaior [linha][coluna] >10)
				{
					System.out.println(contMaior[linha][coluna]);
					cont++;
				}
			}
		}
		  
		System.out.println("\nA quantidade de números maiores que 10 é: "+cont);
		 
	}
}
