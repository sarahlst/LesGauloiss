package Histoire;

import personnages.Gaulois;
import personnages.Romain;

public class scenario {

	public static void main(String[] args) {
		
		    
		        // Créer les personnages
		        Gaulois asterix = new Gaulois("Astérix", 8);
		        Romain minus = new Romain("Minus", 6);

		        // Le gaulois parle
		        asterix.parler("Bonjour à tous");

		        // Le romain parle
		        minus.parler("UN GAU... UN GAUGAU...");

		        // Astérix frappe Minus 3 fois
		        for (int i = 0; i < 3; i++) {
		            asterix.frapper(minus);
		        }
		    }
		

	}


