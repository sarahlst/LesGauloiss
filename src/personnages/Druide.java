package personnages;
import java.util.Random; // Import de la classe Random
public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1; // Initialisé à 1

	
	

	public void preparerPotion() {
	    Random random = new Random();
	    forcePotion = random.nextInt(effetPotionMax + 1); // Génère un nombre entre 0 et effetPotionMax

	    if (forcePotion > 7) {
	        parler("J'ai préparé une super potion de force " + forcePotion + ".");
	    } else {
	        parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion + ".");
	    }
	}

	public void booster(Gaulois gaulois) {
	    if ("Obélix".equals(gaulois.getNom())) {
	        parler("Non, Obélix !... Tu n'auras pas de potion magique !");
	        gaulois.parler("Par Bélénos, ce n'est pas juste !");
	    } else {
	        gaulois.boirePotion(forcePotion); // Utilise la potion préparée
	    }
	}



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