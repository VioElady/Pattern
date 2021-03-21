package structuralPatterns.bridge;

import structuralPatterns.bridge.developers.CppDeveloper;
import structuralPatterns.bridge.developers.JavaDeveloper;
import structuralPatterns.bridge.programs.BankExchange;
import structuralPatterns.bridge.programs.BankSystem;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new BankExchange(new CppDeveloper())
        };

        for(Program program: programs){
            program.developProgram();
        }
    }
}
