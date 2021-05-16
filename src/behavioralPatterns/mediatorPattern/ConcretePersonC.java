package behavioralPatterns.mediator;

public class ConcretePersonC extends Person {

    public ConcretePersonC(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

}