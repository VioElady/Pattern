package structuralPatterns.bridge.developers;

import structuralPatterns.bridge.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}
