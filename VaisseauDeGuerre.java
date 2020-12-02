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

    void attaque(Vaisseau vaisseauCible, String arme, int duree) {
        if (armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivé");
        } else {
            System.out.println("Un vaisseau de type " + typeDeVaisseau + " attaque un vaisseau de type " + vaisseauCible.typeDeVaisseau + " en utilisant l'arme " + arme + " pendant " + duree + " minutes.");
            vaisseauCible.resistanceDuBouclier = 0;
            vaisseauCible.blindage = vaisseauCible.blindage / 2;
        }
    }

    void desactiverArmes() {
        System.out.println("Désactivation des armes d'un vaisseau de type " +typeDeVaisseau+".");
        armesDesactivees = true;
    }

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+typeDeVaisseau+".");
        desactiverArmes();
    }

    int emporterCargaison(int cargaison) {
        if (this.typeDeVaisseau.equals("CHASSEUR")) {
            return cargaison;
        } else {
            if (cargaison < 12) {
                return cargaison;
            } else {
                int tonnagePassagers = 2 * nbPassagers;
                int tonnageRestant = tonnageMax - tonnageActuel;
                int tonnageAConsiderer = (tonnagePassagers < tonnageRestant) ? tonnagePassagers : tonnageRestant;

                if (cargaison > tonnageAConsiderer) {
                    tonnageActuel = tonnageMax;
                    return cargaison - tonnageAConsiderer;
                } else {
                    tonnageActuel += cargaison;
                    return 0;
                }
            }
        }
    }
}