public abstract class Cliente {
    private String nome;
    private String endereco;
    private int idade;
    
    public Cliente(String nome, String endereco, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }
    
    //getters
    
    public String getNome(){
        return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public String obterCliente(){
        return "Cliente: "+nome+", Endereço: "+endereco+", Idade: "+idade+", ";
    }
    
}
