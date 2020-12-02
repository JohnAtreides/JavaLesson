public class VaisseauCivil extends Vaisseau {

    VaisseauCivil(String typeDeVaisseauCivil) {

        this.typeDeVaisseau = typeDeVaisseauCivil;

        if (typeDeVaisseau.equals("CARGO")) {
            this.tonnageMax = 500;
        } else if (typeDeVaisseau.equals("VAISSEAU-MONDE")) {
            this.tonnageMax = 2000;
        } else {
            this.tonnageMax = -1;
            System.out.println("Wrong Vaisseau type entered. Plz enter \"CARGO\" or \"VAISSEAU-MONDE\".");
        }
    }

    int emporterCargaison(int cargaison) {
        int tonnageLibreRestant = tonnageMax - tonnageActuel;
        if (cargaison > tonnageLibreRestant) {
            tonnageActuel = tonnageMax;
            return cargaison - tonnageLibreRestant;
        } else {
            tonnageActuel += cargaison;
            return 0;
        }
    }
}