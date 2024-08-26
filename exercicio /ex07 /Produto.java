package ex07;
import java.time.LocalDate;

public class Produto {
	private String nomeProduto;
	private String descProduto;
	private LocalDate dataFabricacao;
	
	public Produto(String nomeProduto, String descProduto, LocalDate dataFabricacao){
		this.nomeProduto = nomeProduto;
		this.descProduto = descProduto;
		this.dataFabricacao = dataFabricacao;
	}
	
	public String getNomeProduto(){
		return nomeProduto;
	}
	
	public String getDescProduto(){
		return descProduto;
	}
	
	public LocalDate getDataFabricacao(){
		return dataFabricacao;
	}

	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", descProduto=" + descProduto + ", dataFabricacao="
				+ dataFabricacao + "]";
	}
	
}
