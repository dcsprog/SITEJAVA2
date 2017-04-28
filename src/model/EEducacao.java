package model;

public class EEducacao extends Pessoa{
	
	public EEducacao(int id, String nome, String data_nasc, String ccidadao) {
		super(id, nome, data_nasc, ccidadao);
		// TODO Auto-generated constructor stub
	}

	private String contactoP, contactoS;

	public EEducacao(int id, String nome, String data_nasc, String ccidadao, String contactoP, String contactoS) {
		super(id, nome, data_nasc, ccidadao);
		this.contactoP = contactoP;
		this.contactoS = contactoS;
	}

	public String getContactoP() {
		return contactoP;
	}

	public void setContactoP(String contactoP) {
		this.contactoP = contactoP;
	}

	public String getContactoS() {
		return contactoS;
	}

	public void setContactoS(String contactoS) {
		this.contactoS = contactoS;
	}
	
	

	
	
}
