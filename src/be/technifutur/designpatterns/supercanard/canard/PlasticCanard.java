package be.technifutur.designpatterns.supercanard.canard;

import be.technifutur.designpatterns.supercanard.Canard;
import be.technifutur.designpatterns.supercanard.Cancaneur;

public class PlasticCanard extends Canard implements Cancaneur {

    @Override
    public void afficher() {
        System.out.print("Canard en plastique");
    }
}
