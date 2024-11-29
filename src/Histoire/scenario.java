package Histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class scenario {

	public static void main(String[] args) {
		
		    Druide panoramix = new Druide("Panoramix", 5, 10);
	        Gaulois asterix = new Gaulois("Astérix", 8);
	        Gaulois obelix = new Gaulois("Obélix", 25);
	        Romain minus = new Romain("Minus", 6);

	        // Scénario
	        panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10.");
	        panoramix.parler("Je vais aller préparer une petite potion...");
	        panoramix.preparerPotion(); // Préparation de la potion

	        panoramix.booster(obelix); // Obélix ne boit pas la potion
	        panoramix.booster(asterix); // Astérix boit la potion

	        asterix.parler("Bonjour");
	        minus.parler("UN GAU... UN GAUGAU...");
	        asterix.frapper(minus); // Astérix frappe Minus
	    
		     // Astérix frappe Minus 3 fois
		     for (int i = 0; i < 3; i++) {
		         asterix.frapper(minus);
		        }
		    }
		

	}


