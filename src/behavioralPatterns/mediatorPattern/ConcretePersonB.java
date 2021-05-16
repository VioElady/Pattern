package behavioralPatterns.mediator;

public class ConcretePersonB extends Person {

    public ConcretePersonB(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void introduceEveryone(){
        broadcastUpdate();
    }

    private void broadcastUpdate(){
        mediator.broadcastGreet();
    }
}