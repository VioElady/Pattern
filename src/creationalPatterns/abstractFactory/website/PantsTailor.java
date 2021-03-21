package creationalPatterns.abstractFactory.website;

import creationalPatterns.abstractFactory.Tailor;

public class PantsTailor implements Tailor {
    @Override
    public void tailoringClothes() {
        System.out.println("Tailor cuts pants");
    }
}
