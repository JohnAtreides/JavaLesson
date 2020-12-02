public class HelloWorld {
    public static void main(String... args) {

        Planete mercure=new PlaneteTellurique("Mercure");
        mercure.diametre=4880;

        Planete venus=new PlaneteTellurique("Venus");
        venus.diametre=12100;

        Planete terre=new PlaneteTellurique("Terre");
        terre.diametre=12756;

        Planete mars=new PlaneteTellurique("Mars");
        mars.diametre=6792;

        Planete jupiter=new PlaneteGazeuse("Jupiter");
        jupiter.diametre=142984;

        Planete saturne=new PlaneteGazeuse("Saturne");
        saturne.diametre=120536;

        Planete uranus=new PlaneteGazeuse("Uranus");
        uranus.diametre=51118;

        Planete neptune=new PlaneteGazeuse("Neptune");
        neptune.diametre=49532;

        System.out.println(" ");
        System.out.println("===============================================================");
        System.out.println(" ");

        Vaisseau chasseurSurTerre = new VaisseauDeGuerre("CHASSEUR");
        chasseurSurTerre.nbPassagers=9;
        chasseurSurTerre.blindage=156;
        chasseurSurTerre.resistanceDuBouclier=2;
        ((PlaneteTellurique)mars).accueillirVaisseau((Vaisseau)chasseurSurTerre);
        System.out.println("Le chasseur a rejeté "+((VaisseauDeGuerre)chasseurSurTerre).emporterCargaison(20)+" tonnes.");


        Vaisseau fregateSurTerre = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre.nbPassagers = 100;
        ((PlaneteTellurique)terre).accueillirVaisseau((Vaisseau)fregateSurTerre);
        System.out.println("La frégate a rejeté "+((VaisseauDeGuerre)fregateSurTerre).emporterCargaison(45)+" tonnes.");
        System.out.println("La frégate a rejeté "+((VaisseauDeGuerre)fregateSurTerre).emporterCargaison(12)+" tonnes.");


        Vaisseau fregateSurTerre2 = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre2.nbPassagers = 14;
        ((PlaneteTellurique)terre).accueillirVaisseau((Vaisseau)fregateSurTerre2);
        System.out.println("La frégate a rejeté "+((VaisseauDeGuerre)fregateSurTerre2).emporterCargaison(30)+" tonnes.");

        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;
        ((PlaneteTellurique)terre).accueillirVaisseau((Vaisseau)vaisseauMonde);
        System.out.println("La frégate a rejeté "+((VaisseauCivil)vaisseauMonde).emporterCargaison(1560)+" tonnes.");
        System.out.println("La frégate a rejeté "+((VaisseauCivil)vaisseauMonde).emporterCargaison(600)+" tonnes.");


        /*
        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        ((VaisseauDeGuerre)chasseur).attaque(vaisseauMonde, "laser photonique", 3);
        vaisseauMonde.desactiverBouclier();

        System.out.println("Le Vaisseau-Monde dispose encore de "+vaisseauMonde.resistanceDuBouclier+" minutes de protection grâce à son bouclier.");
        System.out.println("Le Vaisseau-Monde dispose encore d'un blindage de valeur "+vaisseauMonde.blindage+".");
         */
    }
}
