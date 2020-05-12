package model;

public class Aluno {
	private String   nome;
	private String   email;
	private int      Matricula;
	
	
	public Aluno(String nome, String email, int matricula) {
		super();
		if(Matricula < 0 || nome == null || nome.length() == 0 || email == null || email.length() == 0) {
			throw new RuntimeException("Valores invalidos!");
		}
		this.nome = nome;
		this.email = email;
		Matricula = matricula;
	}


	public String getNome() { 
		return nome;
	}


	public void setNome(String nome) {
		if(nome == null || nome.length() == 0) {
			throw new RuntimeException("Valor invalido para nome");
		}
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		if(email == null || email.length() == 0) {
			throw new RuntimeException("Valor invalido para email");
		}
		this.email = email;
	}


	public int getMatricula() {
		return Matricula;
	}


	public void setMatricula(int matricula) {
		if( matricula < 0) {
			throw new RuntimeException("Matricula invalid");
		}
		Matricula = matricula;
	}
	
	

}
