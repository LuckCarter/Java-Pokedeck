package app;
class Main {
    public static void main(String[] args) {

        String [] attaque = {"feu", "Explo-Combustion"};
        Carte carte1 = new Carte_Pokemon("Eau", "KyuremEX", 1, "Or", 180, "1", attaque);
        Carte carte2 = new Carte_Pokemon("Feu", "DracaufeuEX", 2, "Or", 180, "2", attaque);

        System.out.println(carte1.getType());
        System.out.println(carte2.getType());

        Paquet paquet = new Paquet();
        paquet.ajout_carte(carte1);
        paquet.ajout_carte(carte2);

        System.out.println(paquet.getNbCarte());
        System.out.println(paquet.getNbCarte());

        carte1.setDescription("pokemon EX");
        System.out.println(carte1.getDescription());

        System.out.println(paquet.liste_paquet());

        Sauvegarde save = new Sauvegarde();
        save.sauvegarder_paquet(paquet);
    }

}