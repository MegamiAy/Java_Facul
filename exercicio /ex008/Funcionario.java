public class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    
    public Funcionario(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    
    // getters
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public double getSalario(){
        return salario+(salario*0.5);
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome+", Idade: "+idade+", Salario: "+salario+".";
    }
    
}
