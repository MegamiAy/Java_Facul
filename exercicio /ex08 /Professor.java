package ex08;

public abstract class Professor {
	protected int matriculaProfessor;
	protected String nomeProfessor;
	
	public Principal(int matriculaProfessor, String nomeProfessor) {
		super();
		this.matriculaProfessor = matriculaProfessor;
		this.nomeProfessor = nomeProfessor;
	}
	
	public int retornaMatricula(){
		return matriculaProfessor;
	}
	
	public String retornaNomeProfessor(){
		return nomeProfessor;
	}
	
}
