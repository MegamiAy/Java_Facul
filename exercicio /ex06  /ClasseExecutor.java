public class ClasseExecutora {

	
	public static void main(String[] args) {
		ExercicioTrimestral extrim = new ExercicioTrimestral();
		
		extrim.vlrFeverero = 3454.00f;
		extrim.vlrJaneiro = (float) 13500.00;
		extrim.vlrMarco = 4623.00f;
		
		extrim.gastoTotal(extrim.vlrJaneiro, extrim.vlrFeverero, extrim.vlrMarco);
		System.out.println(extrim.mediaGasto(extrim.vlrJaneiro, extrim.vlrFeverero, extrim.vlrMarco));
	}
	
}
