package Atividade;

public class ChamadaFatura {

	private String numero;
	private String descricao;
	private Double preco;
	private int quantidade;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	/*
	 
	  metodogetotalfatura
	  calcular o valor
	  retorna o valor
	  se o valor não for positivo == 0
	  tambem o preço do item == 0 se não for positvo
	  
	*/
	public Double getotalfatura() {
		
		
		return preco;
	}
	
	
}
