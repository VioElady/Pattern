package structuralPatterns.adapter;

import java.util.Arrays;
import java.util.List;
import structuralPatterns.adapter.Adaptee;

/**
 * This is the Adapter class: it subclasses the Adaptee and also implements
 * the TargetInterface that is expected by the clients. In this case, adaptation
 * is achieved through inheritance.
 */
public class ClassAdapter extends Adaptee implements TargetInterface {

    public ClassAdapter(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public List<Double> getOperands(){
        return Arrays.asList(super.getFirstOperand(), super.getSecondOperand());
    }

    @Override
    public double sum() {
        return super.computeSum();
    }

    @Override
    public double multiply() {
        return super.getFirstOperand()*super.getSecondOperand();
    }

}
