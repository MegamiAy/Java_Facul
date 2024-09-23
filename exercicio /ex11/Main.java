public class Main {
    
    public static void main(String[] args){
        Juridico ju1 = new Juridico("junior", "rua das labiatas", 43, 56753456);
        Fisico fi1 = new Fisico("jao", "rua das purpuratas", 23, 64445523);
        
        System.out.println("Juridico: "+ju1.obterCliente());
        System.out.println("Fisico: "+fi1.obterCliente());
    }
    
}
