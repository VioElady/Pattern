package structuralPatterns.composite;

import structuralPatterns.composite.elementComposite.HeadDeveloper;
import structuralPatterns.composite.leafs.BackEndDeveloper;
import structuralPatterns.composite.leafs.FrontEndDeveloper;

public class CompositeDemo {
    public static void main(String args[]) {
        Developer backEndDeveloper = new BackEndDeveloper(
                1, "BackEnd developer");
        Developer frontEndDeveloper = new FrontEndDeveloper(
                2, "FrontEnd developer");

        HeadDeveloper headDeveloper = new HeadDeveloper(
                3, "Head developer");

        headDeveloper.addDeveloper(backEndDeveloper);
        headDeveloper.addDeveloper(frontEndDeveloper);

        headDeveloper.printDeveloperType();
    }
}