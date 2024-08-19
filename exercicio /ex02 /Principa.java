package ex02;

public class Principa {

	public static void main(String[] args) {
		Estudante estudante1 = new Estudante();
		Estudante estudante2 = new Estudante();
		
		estudante1.nomeEstudante = "prff";
		estudante1.cursoMatriculado = "ciencia";
		estudante1.idadeEstudante = 19;
		
		estudante2.nomeEstudante = "ldjsad";
		estudante2.cursoMatriculado = "portuga";
		estudante2.idadeEstudante = 16;
		
		System.out.println("Estudante 1"+ estudante1);
		System.out.println("Estudante 2"+ estudante2);
	}
	
}
