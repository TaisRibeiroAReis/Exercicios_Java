package ArrayVetor;
import java.util.Scanner;

public class exercicio04
{
	
	/*4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. 
Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante 
deve ser armazenado na pr�pria matriz. */
	
	public static void main(String[] args)
	{
		float [][] matr1 = new float [2][2];
	    float [][] matr2 = new float [2][2];
	    float [][] matr3 = new float [2][2];
	    
	    int linha,coluna,va,op;
	    
	    Scanner leia = new Scanner(System.in);
	    
	    for(linha=0;linha<2;linha++)
	    {
	    	for(coluna=0;coluna<2;coluna++)
	    	{
	    		System.out.println("\nDigite um valor para a Matriz 1: ");
	    		matr1[linha][coluna] = leia.nextInt();
	    		
	    		System.out.println("\nDigite um valor para a Matriz 2");
	    		matr2[linha][coluna] = leia.nextInt();	
	    	
	    	
	    	}
	    }
	    do 
	    {
	    	System.out.println("\n\t  Menu de op��es  ");
	    	System.out.println("\n1- Somar as duas Matrizes");
	    	System.out.println("\n2- Subtrair a primeira Matriz da segunda");
	    	System.out.println("\n3- Adicionar uma constante a duas matrizes");
	    	System.out.println("\n4- Imprimir as Matrizes");
	        System.out.println("\n5- Sair ...");
	    	System.out.println("\nEscolha uma op��o:");
	        op = leia.nextInt();
	        
	        switch(op)
	        {
	        case 1:
	             for (linha=0;linha<2;linha++)
	             {
	            	 for (coluna=0;coluna<2;coluna++)
	            	 {
	            		matr3[linha][coluna] = matr1[linha][coluna] + matr2 [linha][coluna];
	            		System.out.println("\nA soma �: "+matr3[linha][coluna]);
	            	 }
	             }
	             break;
	        case 2:
	        	for (linha=0;linha<2;linha++)
	             {
	            	 for (coluna=0;coluna<2;coluna++)
	            	 {
	            		matr3[linha][coluna] = matr2[linha][coluna] - matr1 [linha][coluna];
	            		System.out.println("\nA diferen�a �: "+matr3[linha][coluna]);
	            	 }
	             }
	             break;
	        case 3:
	        	System.out.println("\nDigite um n�mero: ");
				va = leia.nextInt();
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						matr1[linha][coluna] = matr1[linha][coluna] + va;
						matr2[linha][coluna] = matr2[linha][coluna] + va;
						System.out.println("\nVari�vel somada a Matriz 1 �: "+matr1[linha][coluna]);
						System.out.println("\nVari�vel somada a Matriz 2 �: "+matr2[linha][coluna]);
					}
				}
				break;
	        case 4:
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						
						System.out.println("\nMatriz 1: "+matr1[linha][coluna]);
						System.out.println("\nMatriz 2: "+matr2[linha][coluna]);
					}
				}
				break;
			case 5:
				System.out.println("\n\t\tObrigado por utilizar esse sistema!!!");
				break;
			default:
				System.out.println("\nEssa Op��o � inv�lida!!!\nDigite uma op��o novamente...");
				
			}
		}
	    while(op!=5);
	   
	    }
	  
   
	    
 }
