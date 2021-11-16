package poo;

public class paciente 
{

	private String nome;
	private String planoSaude;
	private String sintomas;
	
	public paciente (String nome, String planoSaude,String sintomas)
	{
		this.nome = nome;
		this.planoSaude = planoSaude;
		this.sintomas = sintomas;
	}
  
    public void imprimiinfo()
    {
    	System.out.println("\nNome do Paciente: "+nome+"\nPlano de Saúde do Paciente: "+planoSaude+"\nQuadro Cliníco do Paciente: "+sintomas);	
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public String getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

}
