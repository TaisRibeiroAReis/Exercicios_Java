package animalHeranca;

public class preguica extends animal 
{
	private  String raca;
	private  String alimentacao;

public  preguica (String nome,String idade,String som,String acao,String raca,String alimentacao)
{
 super(nome,idade,som,acao);
 this.raca = raca;
 this.alimentacao = alimentacao;
}
public void imprimirInfo()
{
 System.out.println("\nTipo de Animal: "+getNome()+"\nIdade do animal: "+getIdade()+
		 "\nSom emitido pelo animal: "+getSom()+"\nA��o feita pelo Animal: "
		 +getAcao()+"\nTipo de Ra�a do Animal: "+raca+"\nQual � o tipo de alimenta��o: "+alimentacao);
 

}
public String getRaca() {
	return raca;
}
public void setRaca(String raca) {
	this.raca = raca;
}
public String getAlimentacao() {
	return alimentacao;
}
public void setAlimentacao(String alimentacao) {
	this.alimentacao = alimentacao;
}
	
}
