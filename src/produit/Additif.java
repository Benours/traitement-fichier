package produit;

import java.util.ArrayList;
import java.util.List;

public class Additif {
	
	private String libelle;
	private Object listAdditif;

	/**
	 * @param libelle
	 */
	public Additif(String libelle) {
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
			this.listAdditif = null;
		List<String> liste = new ArrayList<>();
		
		String[] token = this.libelle.split(",");
		for (String string : token) {
			liste.add(string);
		}
		
		this.listAdditif = liste;
	}

	/**
	 * @return the listAdditif
	 */
	public Object getListAdditif() {
		return listAdditif;
	}

	/**
	 * @param listAdditif the listAdditif to set
	 */
	public void setListAdditif(Object listAdditif) {
		this.listAdditif = listAdditif;
	}
	
	

}
