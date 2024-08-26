//package AULAS;

public class ExercicioTrimestral {

	float vlrJaneiro;
	float vlrFeverero;
	float vlrMarco;
	
	public ExercicioTrimestral() {
		
	}
	
	public void gastoTotal(float jan, float fev, float mar) {
		System.out.println("O gasto total: " +(jan + fev + mar));
	}
	
	public float mediaGasto(float jan, float fev, float mar) {
		return (jan + fev + mar)/3;
	}
}

