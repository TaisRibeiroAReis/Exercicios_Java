package animalHeranca;

public class animal {

	  private String nome;
	  private String idade;
	  private String som;
	  private String acao;

	  public animal  (String nome, String som, String idade, String acao)
		{
			this.nome = nome;
			this.som = som;
			this.idade = idade;
			this.acao = acao;
		}
	  public void imprimiinfo()
	    {
	    	System.out.println("\nTipo de Animal:"+nome+"\nIdade do animal: "+idade+"\nSom que o animal emite: "+som+"\nAção que o animal faz: "+acao);	
	    }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}

}
