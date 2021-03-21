package structuralPatterns.bridge.programs;

import structuralPatterns.bridge.Developer;
import structuralPatterns.bridge.Program;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }
}
