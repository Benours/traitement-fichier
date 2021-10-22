package produit;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<Produit> listeProduit;
	
	public Stock(List<String> lines) {
		// TODO Auto-generated constructor stub
		List<Produit> liste = new ArrayList<Produit>();

		for (String string : lines) {
			if (string.equals("categorie|marque|nom|nutritionGradeFr|ingredients|energie100g|graisse100g|sucres100g|fibres100g|proteines100g|sel100g|vitA100g|vitD100g|vitE100g|vitK100g|vitC100g|vitB1100g|vitB2100g|vitPP100g|vitB6100g|vitB9100g|vitB12100g|calcium100g|magnesium100g|iron100g|fer100g|betaCarotene100g|presenceHuilePalme|allergenes|additifs|"))
				continue;
			String[] token = string.split("\\|");
			List<String> valeursNutritionnel = new ArrayList<>();
			Categorie categorie = new Categorie("Aucun");
			Marque marque = new Marque("Aucun");
			Ingredient ingredient = new Ingredient("Aucun");
			Additif additif = new Additif("Aucun");
			Allergene allergene = new Allergene("Aucun");
			
			for (int i = 0; i < token.length; i++) {
				if (i == 0)
					categorie.setLibelle(token[i]);
				if (i > 4 && i < 27)
					valeursNutritionnel.add(token[i]);
				if (i == 1)
					marque.setNom(token[i]);
				if (i == 4) {
					ingredient.setLibelle(token[i]);
					ingredient.creerListe();
				}
				if (i == 28) {
					allergene.setLibelle(token[i]);
					allergene.creerListe();
				}
				if (i == 29) {
					additif.setLibelle(token[i]);
					additif.creerListe();
				}
			}
			Produit produit = new Produit(token[2], categorie, marque, token[3], valeursNutritionnel, ingredient, additif, allergene);
			liste.add(produit);
		}
		this.listeProduit = liste;
		
	}

	/**
	 * @return the listeProduit
	 */
	public List<Produit> getListeProduit() {
		return listeProduit;
	}

	/**
	 * @param listeProduit the listeProduit to set
	 */
	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}

	@Override
	public String toString() {
		StringBuilder resultat = new StringBuilder();

		resultat.append("Liste Produit = \n");
		
		for (Produit produit : listeProduit) {
			resultat.append(" - " + produit.toString());
		}
		
		return resultat.toString();
	}

	
	
}
