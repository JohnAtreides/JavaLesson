public class VaisseauDeGuerre extends Vaisseau {

    boolean armesDesactivees;

    VaisseauDeGuerre(String typeDeVaisseauDeGuerre) {

        this.typeDeVaisseau = typeDeVaisseauDeGuerre;

        if (typeDeVaisseau.equals("CHASSEUR")) {
            this.tonnageMax = 0;
        } else if (typeDeVaisseau.equals("FREGATE")) {
            this.tonnageMax = 50;
        } else if (typeDeVaisseau.equals("CROISEUR")) {
            this.tonnageMax = 100;
        } else {
            this.tonnageMax = -1;
            System.out.println("Wrong Vaisseau type entered. Plz enter \"CHASSEUR\",\"FREGATE\" or \"CROISEUR\".");
        }
    }

    void attaque(Vaisseau cible, String arme, int duree) {
        System.out.println("Un vaisseau de type "+typeDeVaisseau+" attaque un vaisseau de type "+cible.typeDeVaisseau+" en utilisant l'arme "+arme+" pendant "+duree+" minutes");
        cible.resistanceDuBouclier=0;
        cible.blindage/=2;
    }
}