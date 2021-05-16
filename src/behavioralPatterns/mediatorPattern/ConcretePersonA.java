package behavioralPatterns.mediator;

public class ConcretePersonA extends Person {

    public ConcretePersonA(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void introduceTheTeam(){
        teamUpdate();
    }

    private void teamUpdate(){
        mediator.teamGreet();
    }
}