package produit;

import java.util.ArrayList;
import java.util.List;

public class Ingredient {
	
	private String libelle;
	private List<String> listIngredient = new ArrayList<>();

	/**
	 * @param libelle
	 */
	public Ingredient(String libelle) {
		this.libelle = libelle;
		creerListe();
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public void creerListe() {
		if (this.libelle == null)
			this.listIngredient = null;
		List<String> liste = new ArrayList<>();
		
		String[] token = this.libelle.split(",");
		for (String string : token) {
			liste.add(string);
		}
		
		this.listIngredient = liste;
	}

	/**
	 * @return the listIngredient
	 */
	public List<String> getListIngredient() {
		return listIngredient;
	}

	/**
	 * @param listIngredient the listIngredient to set
	 */
	public void setListIngredient(List<String> listIngredient) {
		this.listIngredient = listIngredient;
	}
	
	
	

}
