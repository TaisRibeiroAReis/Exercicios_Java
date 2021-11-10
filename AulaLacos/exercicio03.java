package AulaLacos;
import java.util.Scanner;

/*3-Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto */

public class exercicio03 {
	public static void main(System[] args)
	   {
		   int ida;
		   
		   Scanner leia = new Scanner(System.in);
		   
		   System.out.println("\nQual é a sua Idade: ");
		   ida = leia.nextInt();

		   if (ida>=10 && ida<=14)
		   {
			    System.out.println("\nSua Categoria é Infantil");
		   }
		   else if (ida>=15 && ida<=17)
		   {
			    System.out.println("\nSua Categoria é Juvenil");
		   }
		   else if (ida>=18 && ida<=25)
		   {
			    System.out.println("\nSua Categoria é Adulto");    
		   }
		   else 
		   {
			   System.out.println("\nVocê não tem idade para nenhuma das Categorias");
		   }
	   
	   }

}
