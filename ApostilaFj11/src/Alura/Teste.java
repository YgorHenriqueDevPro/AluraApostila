package Alura;

public class Teste {

	public static void main(String[] args) {
		Gerente[] vetorgerente = new Gerente[4];
		
			Gerente gerente = new Gerente();		
			gerente.setNome("João da Silva");			
			
			int senha = Teclado.lerInteiro("Digite sua senha:");	
			gerente.setSenha(1234);		
			gerente.autenticaLogin(senha);

		

	}

}
