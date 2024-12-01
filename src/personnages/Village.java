package personnages;

public class Village {
    private String nom;
    private Gaulois[] villageois;
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private int nbVillageois = 0;

    // Constructeur
    public Village(String nom, int maxVillageois) {
        this.nom = nom;
        this.villageois = new Gaulois[maxVillageois];
    }

    // Ajouter un habitant
    public void ajouterHabitant(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
        } else {
            System.out.println("Erreur : Le village est plein !");
        }
    }

    // Trouver un habitant par numéro
    public Gaulois trouverHabitant(int numero) {
        if (numero >= 0 && numero < nbVillageois) {
            return villageois[numero];
        } else {
            System.out.println("Erreur : Aucun habitant à cet indice !");
            return null;
        }
    }

    // Afficher les habitants
    public void afficherVillageois() {
        System.out.println("Chef : Astérix");
        System.out.print("Villageois : ");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.print(villageois[i].getNom());
            if (i < nbVillageois - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Créer un village
        Village village = new Village("Les légendaires gaulois", 2);

        // Créer les habitants
        Gaulois obelix = new Gaulois("Obélix", 10); // Obélix a une force de 10
        Gaulois asterix = new Gaulois("Astérix", 8); // Astérix a une force de 8

        // Ajouter les habitants au village
        village.ajouterHabitant(obelix);
        village.ajouterHabitant(asterix);

        // Afficher les villageois
        village.afficherVillageois();
    }

    	
    }

