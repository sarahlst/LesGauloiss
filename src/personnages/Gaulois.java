package personnages;

public class Gaulois {
	private String nom; // attribut privee accessible uniquement dans la classe
	private int force; // meme chose
	private int effetPotion = 1; // meme chose mais initialise a une valeur entiere =1

	public Gaulois(String nom, int force) { // methode publique qu'on peut acceder de n'impote qu'elle classe
		this.nom = nom;
		this.force = force;
	}

	public String getNom() { // methode publique qui retourne le nom du personnage
		return nom;
	}

	public void parler(String texte) { // methode publique qui retourne rien car y'a void , ecrit simplement et elle a
										// un seul parametre qui est une chaine de caractere
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	private String prendreParole() { // methode privee qui retourne le nom du gaulois
		return "Le gaulois " + nom + ":";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	/*
	 * @Override public String toString() { return "Gaulois [nom=" + nom +
	 * ", force=" + force + ", effetPotion=" + effetPotion + "]"; }
	 * 
	 * public Gaulois(String nom, int force, int effetPotion) { this.nom = nom;
	 * this.force = force; this.effetPotion = effetPotion; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * }
	 */
	
	/*Conclusion : La méthode toString permet de transformer l’achage de l’objet sous
	sa forme nomDuPaquage.nomDeLaCLasse@adresseMemoire en chaine de
	caractère correspondant à l’état de l’objet.*/
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix); // ca cest la conclusion
		
		 // Tester prendreParole
		    System.out.println(asterix.prendreParole()); // Le gaulois Astérix :

		 // Tester parler
		    asterix.parler("Salam ailekoum !");

		

	}

}
