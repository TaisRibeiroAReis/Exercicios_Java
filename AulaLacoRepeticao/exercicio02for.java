package AulaLacoRepeticao;
import java.util.Scanner; 

/*2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

public class exercicio02for {

	 public static void main(String[] args)
	 {
		 int contImp=0,contP=0,n=10,numero;
		 
		 Scanner leia =new Scanner(System.in);
		 
		 
		 for (n=1;n<=10;n++)
		 { 
			 System.out.printf("\nDigite um número: ");
			 numero = leia.nextInt(); 
		   
		   if(n % 2 == 0)
		   {
			 contP++;
			   
		   }
		    		   
		   else
		   {
			  contImp++;   
		   }
		   
		 }
	    
		 System.out.println("\nA quantidade de números pares é de: "+contP+" e a quantidade de números impares é de: "+contImp);
	 }
}
