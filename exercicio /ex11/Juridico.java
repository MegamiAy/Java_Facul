public class Juridico extends Cliente{
    private double cnpj;
    
    public Juridico(String nome, String endereco, int idade, double cnpj){
        super(nome, endereco, idade);
        this.cnpj = cnpj;
    }
    
    public double getCnpj(){
        return cnpj;
    }
    
    public String obterCliente(){
        return super.obterCliente() + " CNPJ: " + cnpj;
    }
    
}
