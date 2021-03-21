package creationalPatterns.abstractFactory;

public interface BrandCollectionTeamFactory {
    Designer getDesigner();

    Tailor getTailor();

    BrandPromotion getBrandPromotion();
}
