package structuralPatterns.bridge.programs;

import structuralPatterns.bridge.Developer;
import structuralPatterns.bridge.Program;

public class BankExchange extends Program {
    public BankExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stop Exchange Development in progress...");
        developer.writeCode();
    }
}
