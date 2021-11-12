package ArrayVetor;
import java.util.Scanner;

public class exercicio04
{
	
	/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante 
deve ser armazenado na própria matriz. */
	
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
	    	System.out.println("\n\t  Menu de opções  ");
	    	System.out.println("\n1- Somar as duas Matrizes");
	    	System.out.println("\n2- Subtrair a primeira Matriz da segunda");
	    	System.out.println("\n3- Adicionar uma constante a duas matrizes");
	    	System.out.println("\n4- Imprimir as Matrizes");
	        System.out.println("\n5- Sair ...");
	    	System.out.println("\nEscolha uma opção:");
	        op = leia.nextInt();
	        
	        switch(op)
	        {
	        case 1:
	             for (linha=0;linha<2;linha++)
	             {
	            	 for (coluna=0;coluna<2;coluna++)
	            	 {
	            		matr3[linha][coluna] = matr1[linha][coluna] + matr2 [linha][coluna];
	            		System.out.println("\nA soma é: "+matr3[linha][coluna]);
	            	 }
	             }
	             break;
	        case 2:
	        	for (linha=0;linha<2;linha++)
	             {
	            	 for (coluna=0;coluna<2;coluna++)
	            	 {
	            		matr3[linha][coluna] = matr2[linha][coluna] - matr1 [linha][coluna];
	            		System.out.println("\nA diferença é: "+matr3[linha][coluna]);
	            	 }
	             }
	             break;
	        case 3:
	        	System.out.println("\nDigite um número: ");
				va = leia.nextInt();
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						matr1[linha][coluna] = matr1[linha][coluna] + va;
						matr2[linha][coluna] = matr2[linha][coluna] + va;
						System.out.println("\nVariável somada a Matriz 1 é: "+matr1[linha][coluna]);
						System.out.println("\nVariável somada a Matriz 2 é: "+matr2[linha][coluna]);
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
				System.out.println("\nEssa Opção é inválida!!!\nDigite uma opção novamente...");
				
			}
		}
	    while(op!=5);
	   
	    }
	  
   
	    
 }
