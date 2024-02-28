package Alura;

public class Gerente {

	private String nome;
	private String cpf;
	private double salario;
	private int senha;	
	private int numeroDeFuncionariosGerenciados;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}	

	public boolean autenticaLogin(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Senha inválida!");
			return false;
		}

	}
}
