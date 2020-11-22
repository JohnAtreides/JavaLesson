public class HelloWorld {
    public static void main(String... args){

        Planete mercure=new Planete();
        mercure.nom="mercure";
        mercure.matiere="Tellurique";
        mercure.diametre=4880;

        Planete venus=new Planete();
        venus.nom="venus";
        venus.matiere="Tellurique";
        venus.diametre=12100;

        Planete terre=new Planete();
        terre.nom="terre";
        terre.matiere="Tellurique";
        terre.diametre=12756;

        Planete mars=new Planete();
        mars.nom="mars";
        mars.matiere="Tellurique";
        mars.diametre=6792;

        Planete jupiter=new Planete();
        jupiter.nom="jupiter";
        jupiter.matiere="Gazeuse";
        jupiter.diametre=142984;

        Planete saturne=new Planete();
        saturne.nom="saturne";
        saturne.matiere="Gazeuse";
        saturne.diametre=120536;

        Planete uranus=new Planete();
        uranus.nom="uranus";
        uranus.matiere="Gazeuse";
        uranus.diametre=51118;

        Planete neptune=new Planete();
        neptune.nom="neptune";
        neptune.matiere="Gazeuse";
        neptune.diametre=49532;

        /*
        System.out.println(jupiter.nom+" est une planete "+ jupiter.matiere+" avec un diamètre de "+ jupiter.diametre+" kilomètres.");

        System.out.println(neptune.nom+" a effectué "+neptune.revolution(-3542)+" tours autour de son étoile");
        System.out.println(mars.nom+" a effectué"+mars.revolution(-684)+" tours sur elle-même");
        System.out.println(venus.nom+" a effectué "+venus.revolution(1250)+" tours sur elle-même");

        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de "+mars.totalVisiteurs+".");

        Atmosphere uranusAtmosphere=new Atmosphere();
        uranusAtmosphere.hydrogene=83f;
        uranusAtmosphere.helium=15f;
        uranusAtmosphere.methane=2.5f;
        uranus.atmosphere=uranusAtmosphere;

        System.out.println("L'atmosphère d'Uranus est composé :");
        System.out.println("A "+uranusAtmosphere.hydrogene+"% d'hydrogène");
        */

        Vaisseau nouveauVaisseau = new Vaisseau();
        nouveauVaisseau.type="FREGATE";
        nouveauVaisseau.nbPassagers=9;
        mars.accueillirVaisseaux(nouveauVaisseau);
        Vaisseau autreVaisseau = new Vaisseau();
        autreVaisseau.type="CROISEUR";
        autreVaisseau.nbPassagers=42;
        mars.accueillirVaisseaux(autreVaisseau);

        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de "+mars.totalVisiteurs+".");
    }
}
