public class Planete {

    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs=0;
    Vaisseau vaisseauActuellementAcoste;
    Atmosphere atmosphere;
    static String forme="Sphérique";
    static int nbPlanetesDecouvertes=0;

    Planete(String nom){
        this.nom=nom;
        System.out.println("Le nombre de planètes découvertes est actuellement de "+nbPlanetesDecouvertes);
    }


    int revolution(int angle) {
        return angle/360;
    }
    int rotation(int angle) {
        return angle/360;
    }

    Vaisseau accueillirVaisseaux(Vaisseau vaisseau) {
        totalVisiteurs+=vaisseau.nbPassagers;
        if (vaisseauActuellementAcoste==null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        } else {
            System.out.println("Un vaisseau de type "+vaisseauActuellementAcoste.type+" doit s'en aller.");
        }
        Vaisseau vaisseauPrecedent = vaisseauActuellementAcoste;
        vaisseauActuellementAcoste = vaisseau;
        return vaisseauPrecedent;
    }

    static String expansion(double distance) {
        if (distance < 14) {
            return "Oh la la mais c'est super rapide";
        } else {
            return"Je rêve ou c'est plus rapide que la lumière ?";
        }
    }
}