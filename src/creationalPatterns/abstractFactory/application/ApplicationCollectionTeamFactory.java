package creationalPatterns.abstractFactory.application;

import creationalPatterns.abstractFactory.BrandCollectionTeamFactory;
import creationalPatterns.abstractFactory.BrandPromotion;
import creationalPatterns.abstractFactory.Designer;
import creationalPatterns.abstractFactory.Tailor;

public class ApplicationCollectionTeamFactory implements BrandCollectionTeamFactory {
    @Override
    public Designer getDesigner() {
        return new DressDesigner();
    }

    @Override
    public Tailor getTailor() {
        return new DressTailor();
    }

    @Override
    public BrandPromotion getBrandPromotion() {
        return new BrandPromotionApp();
    }
}
