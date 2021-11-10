package AulaLacoRepeticao;
import java.util.Scanner;

public class exercicio03While {

	public static void main(String[]args) 
	
	{
	 	int anos,cont21=0,cont50=0;
	 	
	 	Scanner leia = new Scanner(System.in);
	 	
	 	System.out.println("\n*Para sair digite -99*...");
	 	System.out.println("\nQuantos anos você tem: ");
	 	anos = leia.nextInt();
	 	
	 	while (anos!=-99)
	 	{
	 		if (cont21>21)
	 		{
	 			cont21++;
	 		}
	 	    if (cont50>50)
	 	    {
	 	    	cont50++;
	 	    }
	 	     System.out.println("\nQuantos anos você tem: ");
	 	     anos= leia.nextInt();
	 	}
	 	   System.out.println("\nO total de pessoas com menos de 21 anos é de: " +cont21);
	 	   System.out.println("\nO total de pessoas com idade maior que 50 anos é de: " +cont50);
	 	  
	}
}
