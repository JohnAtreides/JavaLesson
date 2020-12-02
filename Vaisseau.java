public class Vaisseau {
    String typeDeVaisseau;
    int nbPassagers;
    int blindage;
    int resistanceDuBouclier;
    int tonnageMax;
    int tonnageActuel;

    void activerBouclier() {
        System.out.println("Activation du bouclier d'un vaisseau de type "+typeDeVaisseau);
    }

    void desactiverBouclier() {
        System.out.println("Désactivation du bouclier d'un vaisseau de type "+typeDeVaisseau);
    }
}