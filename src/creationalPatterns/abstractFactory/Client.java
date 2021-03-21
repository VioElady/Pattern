package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.application.ApplicationCollectionTeamFactory;

public class Client {
    public static void main(String[] args) {
        BrandCollectionTeamFactory brandCollectionTeamFactory = new ApplicationCollectionTeamFactory();
        Designer designer = brandCollectionTeamFactory.getDesigner();
        Tailor tailor = brandCollectionTeamFactory.getTailor();
        BrandPromotion brandPromotion = brandCollectionTeamFactory.getBrandPromotion();

        System.out.println("Creating application... ");
        designer.clothingDesign();
        tailor.tailoringClothes();
        brandPromotion.promotion();


    }
}
