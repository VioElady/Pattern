package structuralPatterns.adapter;

import java.util.List;

public interface TargetInterface {

    public List<Double> getOperands();

    public double sum();

    public double max();

    public double multiply();
}