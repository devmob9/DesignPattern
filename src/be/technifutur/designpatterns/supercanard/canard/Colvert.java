package be.technifutur.designpatterns.supercanard.canard;

import be.technifutur.designpatterns.supercanard.Canard;
import be.technifutur.designpatterns.supercanard.Cancaneur;
import be.technifutur.designpatterns.supercanard.Volant;

public class Colvert extends Canard implements Volant, Cancaneur {

    @Override
    public void afficher() {
        System.out.print("Colvert");
    }
}
