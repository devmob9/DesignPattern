package be.technifutur.designpatterns.supercanard;

import java.util.HashSet;

class MareACanard {
    private final HashSet<Canard> canardList = new HashSet<>();

    public void add(Canard canard) {
        this.canardList.add(canard);
        canard.afficher();
        System.out.print(": ");
        canard.nager();
        System.out.println();
    }

    public void observer() {
        System.out.println("!!!");
        this.canardList.forEach(c -> {
            System.out.print("~~~");
            c.afficher();
        });
        System.out.println();
        System.out.println("!!!");
    }

    public void ecouter() {
        System.out.println("!!!");
        this.canardList.forEach(c -> {
            c.afficher();
            System.out.print(": ");
            c.cancaner();
            System.out.println();
        });
        System.out.println("!!!");
    }
}
