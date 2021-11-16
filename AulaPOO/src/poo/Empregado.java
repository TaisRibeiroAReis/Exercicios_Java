package poo;

import java.text.NumberFormat;

public class Empregado {
 
	private String nome;
	private String funcao;
	private double salario;
	
	public Empregado (String codigo,String funcao,double salario)
	{
		this.nome=nome;
		this.funcao=funcao;
		this.salario=salario;
	}
    public void imprimirInfo () 
    {
    	System.out.println("\nNome do Funcionario(a): "+nome+"\nFunção exercida: "+funcao+"\nSalario:"
    			+salario);
    }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
}
