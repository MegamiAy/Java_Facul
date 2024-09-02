package ex08;

public class ProfessorMensalista extends Professor {
	protected float valorSalario;
	
	public ProfessorMensalista(int matriculaProfessor, String nomeProfessor, float valorSalario) {
		super(matriculaProfessor, nomeProfessor);
		this.valorSalario = valorSalario;
	}

	public float getValorSalario() {
		return valorSalario;
	}
	
}
