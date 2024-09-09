package ex10;

public class Ciclismo extends Bicicleta{
	private int espessuraPneu;
	
	public Ciclismo(int marcha, int cadencia, int espessura) {
		super(marcha, cadencia);
		this.espessuraPneu = espessuraPneu;
	}
	
	public String obterDescricao() {
		return super.obterDescricao() + " Espessura Pneu: " + this.espessuraPneu;
	}

}
