package ex04;

public class Principal { 
	
    public static void main(String[] args) {
    	int soma = 0;
    		
        for (int num = 1; num <= 1000; num++) {
            soma+=num;
        }
        
        System.out.println("soma de 1 a 1000: "+ soma);
    }
}
