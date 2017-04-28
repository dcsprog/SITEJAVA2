package model;

public class Crianca extends Pessoa{
	
	private String observacoes;
	
	public Crianca(int id, String nome, String data_nasc, String ccidadao, String observacoes) {
		super(id, nome, data_nasc, ccidadao);
		this.observacoes = observacoes;
	}

	public Crianca(int id, String nome, String data_nasc, String ccidadao) {
		super(id, nome, data_nasc, ccidadao);
		// TODO Auto-generated constructor stub
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	

}
