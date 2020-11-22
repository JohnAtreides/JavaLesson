public class Planete {

    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs=0;
    Vaisseau vaisseauActuellementAcoste;
    Atmosphere atmosphere;


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
}