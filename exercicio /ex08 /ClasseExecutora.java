package ex08;

public class ClasseExecutora {
	
	public static void main(String[] args) {
		ProfessorHorista profHora = new ProfessorHorista(3565, "Gustavo", 65.00f, 30);
		ProfessorMensalista profMes = new ProfessorMensalista(7533, "Felipe", 5000.00f);

		System.out.println(profHora);
		System.out.println(profMes);
		
		System.out.println(profHora.nomeProfessor+" "+profHora.obterSalario());
		System.out.println(profMes.retornaNomeProfessor()+" "+profMes.getValorSalario());
	}
		
}
