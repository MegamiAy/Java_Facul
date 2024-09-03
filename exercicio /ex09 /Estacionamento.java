package ex09;

public class Estacionamento {
	protected String modeloVeiculo;
	protected String nomeCondutor;
	
	public Estacionamento(String modeloVeiculo, String nomeCondutor) {
		this.modeloVeiculo = modeloVeiculo;
		this.nomeCondutor = nomeCondutor;
	}
	
	public String retornaModeloVeiculo() {
		return modeloVeiculo;
	}
	
	public String retornaNomeCondutor() {
		return nomeCondutor;
	}
}

//package ex09;
//
//public class Veiculo extends Estacionamento {
//	protected String placaVeiculo;
//	protected String marcaVeiculo;
//	protected String corVeiculo;
//
//	public Veiculo(String modeloVeiculo, String nomeCondutor, String placaVeiculo, String marcaVeiculo, String corVeiculo) {
//		super(modeloVeiculo, nomeCondutor);
//		this.placaVeiculo = placaVeiculo;
//		this.marcaVeiculo = marcaVeiculo;
//		this.corVeiculo = corVeiculo;
//	}
//
//}

//package ex09;
//
//public class Condutor extends Estacionamento {
//	protected int cpfCondutor;
//	protected int tellCondutor;
//
//	public Condutor(String modeloVeiculo, String nomeCondutor, int cpfCondutor, int tellCondutor) {
//		super(modeloVeiculo, nomeCondutor);
//		this.cpfCondutor = cpfCondutor;
//		this.tellCondutor = tellCondutor;
//	}
//
//	public String veiculosCondutor() {
//		return this.modeloVeiculo;
//	}
//
//	@Override
//	public String toString() {
//		return "Condutor [cpfCondutor=" + cpfCondutor + ", tellCondutor=" + tellCondutor + ", modeloVeiculo="
//				+ modeloVeiculo + ", nomeCondutor=" + nomeCondutor + "]";
//	}
//	
//}

//package ex09;
//
//public class ClasseExecutora {
//
//	public static void main(String[] args) {
//		Condutor condutor = new Condutor("hilux", "josefinha", 843673345, 3463330);
//		Veiculo veiculo = new Veiculo("Hilux", "joão", "75A33", "Toyota", "Vermelho");
//	
//		System.out.println(condutor);
//		System.out.println(veiculo);
//	}
//	
//	
//	
//}
//		
////		System.out.println(profHora.nomeProfessor+" "+profHora.obterSalario());
////		System.out.println(profMes.retornaNomeProfessor()+" "+profMes.getValorSalario());
////	}
////		
////}
