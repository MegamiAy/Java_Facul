public class Fisico extends Cliente{
    private double cpf;
    
    public Fisico(String nome, String endereco, int idade, double cpf){
        super(nome, endereco, idade);
        this.cpf = cpf;
    }
    
    public double getCpf(){
        return cpf;
    }
    
    public String obterCliente(){
        return super.obterCliente() + " CPF: " + cpf;
    }
    
}
