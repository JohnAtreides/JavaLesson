public abstract class Planete {

    String nom;
    long diametre;
    int totalVisiteurs=0;
    Vaisseau vaisseauActuellementAcoste;
    Atmosphere atmosphere;
    static String forme="Sphérique";
    static int nbPlanetesDecouvertes=0;

    Planete(String nom){
        this.nom=nom;
        nbPlanetesDecouvertes++;
        System.out.println("Le nombre de planètes découvertes est actuellement de "+nbPlanetesDecouvertes);
    }
    
    int revolution(int angle) {
        return angle/360;
    }

    int rotation(int angle) {
        return angle/360;
    }

    static String expansion(double distance) {
        if (distance < 14) {
            return "Oh la la mais c'est super rapide";
        } else {
            return"Je rêve ou c'est plus rapide que la lumière ?";
        }
    }
}