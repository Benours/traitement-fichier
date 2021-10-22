package produit;

import java.util.List;

public class Produit {
	private String nom;
	private Categorie categorie;
	private Marque marque;
	private String scoreNutritionnel;
	private List<String> listeValeursNutritionnelles;
	private Ingredient ingredients;
	private Additif additifs;
	private Allergene allergenes;
	/**
	 * @param nom
	 * @param categorie
	 * @param marque
	 * @param scoreNutritionnel
	 * @param listeValeursNutritionnelles
	 * @param ingredients
	 * @param additifs
	 * @param allergenes
	 */
	public Produit(String nom, Categorie categorie, Marque marque, String scoreNutritionnel,
			List<String> listeValeursNutritionnelles, Ingredient ingredients, Additif additifs, Allergene allergenes) {
		this.nom = nom;
		this.categorie = categorie;
		this.marque = marque;
		this.scoreNutritionnel = scoreNutritionnel;
		this.listeValeursNutritionnelles = listeValeursNutritionnelles;
		this.ingredients = ingredients;
		this.additifs = additifs;
		this.allergenes = allergenes;
	}
	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}
	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	/**
	 * @return the marque
	 */
	public Marque getMarque() {
		return marque;
	}
	/**
	 * @param marque the marque to set
	 */
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	/**
	 * @return the scoreNutritionnel
	 */
	public String getScoreNutritionnel() {
		return scoreNutritionnel;
	}
	/**
	 * @param scoreNutritionnel the scoreNutritionnel to set
	 */
	public void setScoreNutritionnel(String scoreNutritionnel) {
		this.scoreNutritionnel = scoreNutritionnel;
	}
	/**
	 * @return the listeValeursNutritionnelles
	 */
	public List<String> getListeValeursNutritionnelles() {
		return listeValeursNutritionnelles;
	}
	/**
	 * @param listeValeursNutritionnelles the listeValeursNutritionnelles to set
	 */
	public void setListeValeursNutritionnelles(List<String> listeValeursNutritionnelles) {
		this.listeValeursNutritionnelles = listeValeursNutritionnelles;
	}
	/**
	 * @return the listeIngredients
	 */
	public Ingredient getIngredients() {
		return ingredients;
	}
	/**
	 * @param listeIngredients the listeIngredients to set
	 */
	public void setIngredients(Ingredient ingredients) {
		this.ingredients = ingredients;
	}
	/**
	 * @return the listeAdditifs
	 */
	public Additif getAdditifs() {
		return additifs;
	}
	/**
	 * @param listeAdditifs the listeAdditifs to set
	 */
	public void setAdditifs(Additif additifs) {
		this.additifs = additifs;
	}
	/**
	 * @return the listeAllergenes
	 */
	public Allergene getAllergenes() {
		return allergenes;
	}
	/**
	 * @param listeAllergenes the listeAllergenes to set
	 */
	public void setListeAllergenes(Allergene allergenes) {
		this.allergenes = allergenes;
	}
	@Override
	public String toString() {
		StringBuilder resultat = new StringBuilder();
		
		resultat.append(nom + " :\n");
		resultat.append("    - categorie : " + categorie.getLibelle() + "\n");
		resultat.append("    - marque : " + marque.getNom() + "\n");
		resultat.append("    - score nutritionnel : " + scoreNutritionnel + "\n");
		resultat.append("    - valeurs nutritionnel : " + listeValeursNutritionnelles + "\n");
		resultat.append("    - ingredients : " + ingredients.getListIngredient() + "\n");
		resultat.append("    - additifs : " + additifs.getListAdditif() + "\n");
		resultat.append("    - allergenes : " + allergenes.getListAllergene() + "\n");
		
		return resultat.toString();
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
