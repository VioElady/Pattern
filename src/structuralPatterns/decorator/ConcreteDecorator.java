package structuralPatterns.decorator;
/**
 * This concrete decorator adds further state and responsibilities to the
 * decorated component
 */
public class ConcreteDecorator extends AbstractDecorator {

    private String job;

    public ConcreteDecorator(AbstractComponent decorated, String job) {
        super(decorated);
        this.job = job;
    }

    /**
     * Implement abstract behaviour stated in AbstractDecorator
     */
    @Override
    public String getJob(){
        return this.job;
    }


}