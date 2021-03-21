package creationalPatterns.abstractFactory.application;

import creationalPatterns.abstractFactory.BrandPromotion;

public class BrandPromotionApp implements BrandPromotion {
    @Override
    public void promotion() {
        System.out.println("BrandPromotion promote brand...");
    }
}
