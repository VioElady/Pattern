package creationalPatterns.abstractFactory.website;

import creationalPatterns.abstractFactory.Designer;

public class PantsDesigner implements Designer {
    @Override
    public void clothingDesign() {
        System.out.println("PantsDesigner designs pants");
    }
}
