package fr.pizzeria.model;

public class PizzaDD {
	
	private static int Id =0; 
	private String Libelle;
	private String Code;
	private Double Prix;
	
	public PizzaDD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PizzaDD(int id, String libelle, String code, double prix) {
		Id++;
		Libelle = libelle;
		Code = code;
		Prix = prix;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public Double getPrix() {
		return Prix;
	}

	public void setPrix(Double prix) {
		Prix = prix;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("ID : "+ Id+ "Libellé :" +Libelle+ "Code :" +Code+ "Prix : " +Prix);
	}
	
	
	
	
	
	

}
