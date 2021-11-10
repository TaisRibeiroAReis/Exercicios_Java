package AulaLacos;
import java.util.Scanner;

/*2- Faça um programa que entre com três números e coloque 
em ordem crescente.
        Menor  Meio  Maior 
		  a      b      c
		  a      c      b
		  b      a      c
		  b      c      a
		  c      a      b
		  c      b      a */

public class exercicio02 {

		public static void main(String[] args)
		
		{
			int a,b,c;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\n Digite um Numero A: "); 
			a = leia.nextInt();
			System.out.println("\n Digite um Numero B: ");
			b = leia.nextInt();
			System.out.println("\n Digite um Numero C: ");
			c = leia.nextInt();
			
			if (a<=b && b<=c)
			{
				System.out.println("\nOrdem Crescente: " +a+ " , " +b+ " , " +c);
			}
			else if (a<=c && c<=b)
			{
			    System.out.println("\nOrdem Crescente: "+a+","+c+","+b);	
			}
			else if (b<=a && a<=c)
			{
				System.out.println("\nOrdem Crescente: "+b+","+a+","+c);
			}
			else if (b<=c && c<=a)
			{
				System.out.println("\nOrdem Crescente: "+b+","+c+","+a);
			}
			else if (c<=a && a<=b)
			{
				System.out.println("\nOrdem Crescente: "+c+","+a+","+b);
			}
			else
			{
				System.out.print("\nOrdem Crescente: "+c+","+b+","+a);
			}
		}	
}
