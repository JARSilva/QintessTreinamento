package Entidaddes;

public class Cliente {
	private String nome;
	private int rg;
	private int cpf;
	private String senha;
	
	
	public Cliente(String nome, int rg, int cpf, String senha) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
