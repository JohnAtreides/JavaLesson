public class PlaneteTellurique extends Planete implements Habitable{

    public PlaneteTellurique(String nom) {
        super(nom);
    }

    public Vaisseau accueillirVaisseaux(Vaisseau nouveauVaisseau) {
        totalVisiteurs+=nouveauVaisseau.nbPassagers;
        if (vaisseauActuellementAcoste==null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        } else {
            System.out.println("Un vaisseau de type "+vaisseauActuellementAcoste.type+" doit s'en aller.");
        }
        Vaisseau vaisseauPrecedent = vaisseauActuellementAcoste;
        vaisseauActuellementAcoste = nouveauVaisseau;
        return vaisseauPrecedent;
    }
}
