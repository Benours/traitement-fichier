package produit;

import java.util.ArrayList;
import java.util.List;

public class Allergene {
	
	private String libelle;
	private List<String> listAllergene = new ArrayList<String>();

	/**
	 * @param libelle
	 */
	public Allergene(String libelle) {
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
			this.listAllergene= null;
		List<String> liste = new ArrayList<>();
		
		String[] token = this.libelle.split(",");
		for (String string : token) {
			liste.add(string);
		}
		
		this.listAllergene = liste;
	}

	/**
	 * @return the listAllergene
	 */
	public List<String> getListAllergene() {
		return listAllergene;
	}

	/**
	 * @param listAllergene the listAllergene to set
	 */
	public void setListAllergene(List<String> listAllergene) {
		this.listAllergene = listAllergene;
	}
	

}
