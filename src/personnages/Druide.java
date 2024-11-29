package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;



	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) { // on a la fonction on appuyant sur source getter setter 
		this.nom = nom; // et cela parce que les attribut de la classe sont privee et il faut avoir comme 
	} // une autorisartion 

	public int getEffetPotionMin() {
		return effetPotionMin;
	}

	public void setEffetPotionMin(int effetPotionMin) {
		this.effetPotionMin = effetPotionMin;
	}

	public int getEffetPotionMax() {
		return effetPotionMax;
	}

public void setEffetPotionMax(int effetPotionMax) {
	this.effetPotionMax = effetPotionMax;
}
}