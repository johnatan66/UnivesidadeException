import java.util.Scanner;

import bd.BaseAlunos;
import model.Aluno;

public class MainClass {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		String nome, email;
		int Matricula;
		int continua = 1;
		BaseAlunos base = new BaseAlunos();
		
		do {
			try {
				System.out.println("Digite o numero de matricula");
				Matricula = Integer.parseInt(teclado.nextLine());
				System.out.println("Digite o nome: ");
				nome = teclado.nextLine();
				System.out.println("Digite o email:");
				email = teclado.nextLine();
				
				Aluno aluno = new Aluno(nome, email, Matricula);
				base.inserir(aluno);
				
				System.out.println("Continua? 1-sim 0-não");
				continua = Integer.parseInt(teclado.nextLine());
			}catch(RuntimeException ex) {
				System.out.println("Erro ao inserir - "+ex.getMessage());
			}
		}while(continua == 1);
		teclado.close();
		
	}

}
