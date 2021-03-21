package creationalPatterns.abstractFactory.website;

import creationalPatterns.abstractFactory.BrandCollectionTeamFactory;
import creationalPatterns.abstractFactory.BrandPromotion;
import creationalPatterns.abstractFactory.Designer;
import creationalPatterns.abstractFactory.Tailor;

public class WebsiteCollectionTeamFactory implements BrandCollectionTeamFactory {
    @Override
    public Designer getDesigner() {
        return new PantsDesigner();
    }

    @Override
    public Tailor getTailor() {
        return new PantsTailor();
    }

    @Override
    public BrandPromotion getBrandPromotion() {
        return new WebsiteBrandPromotion();
    }
}
