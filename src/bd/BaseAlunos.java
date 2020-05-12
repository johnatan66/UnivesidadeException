package bd;
import java.util.ArrayList;

import model.Aluno;

public class BaseAlunos {
	private ArrayList<Aluno> lista;
	
	public BaseAlunos() {
		lista = new ArrayList<Aluno>();
	}
	public void inserir(Aluno novo) {
		for( Aluno a : lista) {
			if(a.getEmail().contentEquals(novo.getEmail()) || a.getMatricula() == novo.getMatricula()) {
				throw new RuntimeException("Aluno ja existe na base de dados");
			}
		}
		lista.add(novo);
		
	}
	public Aluno consultar(int Matricula) {
		for(Aluno a: lista) {
			if(a.getMatricula() == Matricula) {
				return a;
			}
		}
		return null;
	}
}