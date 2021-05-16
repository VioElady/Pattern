package behavioralPatterns.mediator;

import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Person> team;
    private List<Person> all;
    public ConcreteMediator(List<Person> team, List<Person> all) {
        this.team = team;
        this.all = all;
    }

    @Override
    public void teamGreet() {
        System.out.println("Mediator will ask team members to greet");
        for (Person person : team) {
            person.teamGreet();
        }
    }

    @Override
    public void broadcastGreet() {
        System.out.println("Mediator will ask everyone to greet");
        for (Person person : all) {
            person.greet();
        }
    }
}