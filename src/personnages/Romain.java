package personnages;

import personnages.Gaulois;

public class Romain {
	private String nom; // attribut privee accessible depuis la classe seulement  
	private int force ;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println( prendreParole() + "<< " + texte + ">>");
	}
	
    private String prendreParole() {
    	return "Le romain " + nom + " : " ;
    }
	
    public void recevoirCoup(int forceCoup) {
    	force -= forceCoup;
    	if (force > 0 ) {
    		parler("Aieee ");
    	}else {
    		parler("j'abandonne...");
    	}
    }
    public static void main(String[] args) {
    	 Romain minus = new Romain("Minus", 6);
    	 System.out.println(minus);

    	 
    	    
    }
}
