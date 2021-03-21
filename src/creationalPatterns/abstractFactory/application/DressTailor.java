package creationalPatterns.abstractFactory.application;

import creationalPatterns.abstractFactory.Tailor;

public class DressTailor implements Tailor {
    @Override
    public void tailoringClothes() {
        System.out.println("Tailor cuts dresses");
    }
}
