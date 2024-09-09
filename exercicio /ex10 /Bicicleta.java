package ex10;

public abstract class Bicicleta {
	private int marcha;
	private int cadencia;
	
	public Bicicleta(int marcha, int cadencia) {
		this.marcha = marcha;
		this.cadencia = cadencia;
	}
	
	public String obterDescricao() {
		return ("Marcha: " + this.marcha + " Cadencia: " + this.cadencia);
	}
	
}
