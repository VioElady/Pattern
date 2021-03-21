package creationalPatterns.abstractFactory.website;

import creationalPatterns.abstractFactory.BrandPromotion;

public class WebsiteBrandPromotion implements BrandPromotion {
    @Override
    public void promotion() {
        System.out.println("WebsiteBrandPromotion promote website...");
    }
}
