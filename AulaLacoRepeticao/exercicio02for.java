package AulaLacoRepeticao;
import java.util.Scanner; 

/*2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

public class exercicio02for {

	 public static void main(String[] args)
	 {
		 int contImp=0,contP=0,n=10,numero;
		 
		 Scanner leia =new Scanner(System.in);
		 
		 
		 for (n=1;n<=10;n++)
		 { 
			 System.out.printf("\nDigite um n�mero: ");
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
	    
		 System.out.println("\nA quantidade de n�meros pares � de: "+contP+" e a quantidade de n�meros impares � de: "+contImp);
	 }
}
