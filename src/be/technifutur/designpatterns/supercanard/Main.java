package be.technifutur.designpatterns.supercanard;

import be.technifutur.designpatterns.supercanard.canard.Colvert;
import be.technifutur.designpatterns.supercanard.canard.Leurre;
import be.technifutur.designpatterns.supercanard.canard.Mandarin;
import be.technifutur.designpatterns.supercanard.canard.PlasticCanard;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        afficheTitre();
        MareACanard mare = buildMareACanard();

        String choix = demanderChoix();
        while (!"q".equals(choix)) {
            switch (choix) {
                case "o":
                    mare.observer();
                    break;
                case "e":
                    mare.ecouter();
                    break;
                case "v":
                    mare.enVol();
                    break;
            }
            choix = demanderChoix();
        }
    }

    private static String demanderChoix() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.print("!! Observer(o) Ecoute(e) Voler(v) Quitter(q): ");

        return new Scanner(System.in).nextLine();
    }

    private static MareACanard buildMareACanard() {
        MareACanard mare = new MareACanard();
        mare.add(new Colvert());
        mare.add(new Leurre());
        mare.add(new Mandarin());
        mare.add(new PlasticCanard());
        return mare;
    }

    private static void afficheTitre() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!     Super Canard     !!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
