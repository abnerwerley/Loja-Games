package com.generation.LojaGames.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Id Long idProduto;
	
	@NotBlank
	private String nomeProdutos;
	
	@NotBlank
	private Double preco;
	
	@NotBlank
	private String tipoProduto;
	
	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProdutos() {
		return nomeProdutos;
	}

	public void setNomeProdutos(String nomeProdutos) {
		this.nomeProdutos = nomeProdutos;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

}
