package creationalPatterns.abstractFactory.application;

import creationalPatterns.abstractFactory.Designer;

public class DressDesigner implements Designer {

    @Override
    public void clothingDesign() {
        System.out.println("DressDesigner designs dresses");
    }
}
