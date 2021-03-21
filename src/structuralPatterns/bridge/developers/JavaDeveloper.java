package structuralPatterns.bridge.developers;

import structuralPatterns.bridge.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
