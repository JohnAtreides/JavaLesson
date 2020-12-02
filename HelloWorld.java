public class HelloWorld {
    public static void main(String... args){

        Planete mercure=new PlaneteTellurique("Mercure");
        mercure.diametre=4880;

        Planete venus=new PlaneteTellurique("Venus");
        venus.diametre=12100;

        Planete terre=new PlaneteTellurique("Terre");
        terre.diametre=12756;

        PlaneteTellurique mars=new PlaneteTellurique("Mars");
        mars.diametre=6792;

        Planete jupiter=new PlaneteGazeuse("Jupiter");
        jupiter.diametre=142984;

        Planete saturne=new PlaneteGazeuse("Saturne");
        saturne.diametre=120536;

        Planete uranus=new PlaneteGazeuse("Uranus");
        uranus.diametre=51118;

        Planete neptune=new PlaneteGazeuse("Neptune");
        neptune.diametre=49532;


        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.nbPassagers=9;
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;

        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;

        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        ((VaisseauDeGuerre)chasseur).attaque(vaisseauMonde, "laser photonique", 3);
        vaisseauMonde.desactiverBouclier();

        System.out.println("Le Vaisseau-Monde dispose encore de "+vaisseauMonde.resistanceDuBouclier+" minutes de protection grâce à son ouclier.");
        System.out.println("Le Vaisseau-monde dispose encore d'un blindage de valeur "+vaisseauMonde.blindage+".");

        mars.accueillirVaisseaux(vaisseauMonde);
        mars.accueillirVaisseaux(chasseur);

        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de "+mars.totalVisiteurs+".");

        System.out.println("La forme d'une planète est : "+Planete.forme);







    }
}
