package be.technifutur.designpatterns.supercanard;

public abstract class Canard {

    public void cancaner() {
        System.out.print("Coin Coin");
    }

    public void nager() {
        System.out.print("plouf plouf je nage comme un chef");
    }

    public abstract void afficher();
}
