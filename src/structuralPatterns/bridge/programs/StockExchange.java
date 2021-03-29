package structuralPatterns.bridge.programs;

import structuralPatterns.bridge.Developer;
import structuralPatterns.bridge.Program;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stop Exchange development in progress...");
        developer.writeCode();
    }
}
