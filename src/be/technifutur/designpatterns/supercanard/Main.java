package be.technifutur.designpatterns.supercanard;

import be.technifutur.designpatterns.supercanard.canard.Colvert;
import be.technifutur.designpatterns.supercanard.canard.Mandarin;

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
            }
            choix = demanderChoix();
        }
    }

    private static String demanderChoix() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.print("!! Observer(o) Ecoute(e) Quitter(q): ");

        return new Scanner(System.in).nextLine();
    }

    private static MareACanard buildMareACanard() {
        MareACanard mare = new MareACanard();
        mare.add(new Colvert());
        mare.add(new Colvert());
        mare.add(new Mandarin());
        return mare;
    }

    private static void afficheTitre() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!     Super Canard     !!");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
