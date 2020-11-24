public class HelloWorld {
    public static void main(String... args){

        Planete mercure=new Planete("Mercure");
        mercure.matiere="Tellurique";
        mercure.diametre=4880;

        Planete venus=new Planete("Venus");
        venus.matiere="Tellurique";
        venus.diametre=12100;

        Planete terre=new Planete("Terre");
        terre.matiere="Tellurique";
        terre.diametre=12756;

        Planete mars=new Planete("Mars");
        mars.matiere="Tellurique";
        mars.diametre=6792;

        Planete jupiter=new Planete("Jupiter");
        jupiter.matiere="Gazeuse";
        jupiter.diametre=142984;

        Planete saturne=new Planete("Saturne");
        saturne.matiere="Gazeuse";
        saturne.diametre=120536;

        Planete uranus=new Planete("Uranus");
        uranus.matiere="Gazeuse";
        uranus.diametre=51118;

        Planete neptune=new Planete("Neptune");
        neptune.matiere="Gazeuse";
        neptune.diametre=49532;

        /*
        Vaisseau nouveauVaisseau = new Vaisseau();
        nouveauVaisseau.type="FREGATE";
        nouveauVaisseau.nbPassagers=9;
        mars.accueillirVaisseaux(nouveauVaisseau);
        Vaisseau autreVaisseau = new Vaisseau();
        autreVaisseau.type="CROISEUR";
        autreVaisseau.nbPassagers=42;
        mars.accueillirVaisseaux(autreVaisseau);

        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de "+mars.totalVisiteurs+".");

        System.out.println("La forme d'une planète est : "+Planete.forme);

        Planete.expansion(10.5);
        */

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;

        chasseur.activerBouclier();
        vaisseauMonde.activerBouclier();

        chasseur.attaque(vaisseauMonde, "lasers photoniques", 3);

        vaisseauMonde.desactiverBouclier();

        System.out.println("Protection résiduelle "+vaisseauMonde.resistanceDuBouclier);

        System.out.println("Blindage "+vaisseauMonde.blindage);

    }
}
