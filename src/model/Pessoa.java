package model;

public abstract class Pessoa {
	
	private int id;
	private String nome, data_nasc,
					ccidadao;
	public Pessoa(int id, String nome, String data_nasc, String ccidadao) {
		super();
		this.id = id;
		this.nome = nome;
		this.data_nasc = data_nasc;
		this.ccidadao = ccidadao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	public String getCcidadao() {
		return ccidadao;
	}
	public void setCcidadao(String ccidadao) {
		this.ccidadao = ccidadao;
	}
	
	

}
