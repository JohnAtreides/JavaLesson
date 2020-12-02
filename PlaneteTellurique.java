public class PlaneteTellurique extends Planete implements Habitable{

    public PlaneteTellurique(String nom) {
        super(nom);
    }

    public Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau) {
        totalVisiteurs+=nouveauVaisseau.nbPassagers;
        if (vaisseauActuellementAcoste==null) {
            System.out.println("Aucun vaisseau ne s'en va de "+nom+".");
        } else {
            System.out.println("Un vaisseau de type "+vaisseauActuellementAcoste.typeDeVaisseau+" doit s'en aller de "+nom+".");
        }
        Vaisseau vaisseauPrecedent = vaisseauActuellementAcoste;
        vaisseauActuellementAcoste = nouveauVaisseau;
        return vaisseauPrecedent;
    }
}
