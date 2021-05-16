package behavioralPatterns.mediator;

import java.util.Arrays;
import java.util.List;

    public class Demo {

        public static void main(String[] args) {
            System.out.println("***Demo: Mediator pattern");
            System.out.println("Creating: Three ConcreteColleagues - Tom, Leila and Joe");
            Person personA = new ConcretePersonA("Tom", null);
            Person personB = new ConcretePersonB("Leila", null);
            Person personC = new ConcretePersonC("Joe", null);

            System.out.println("Creating: Team with Leila and Joe");
            List<Person> team = Arrays.asList(personB, personC);
            List<Person> all = Arrays.asList(personA, personB, personC);

            System.out.println("Creating: Mediator instance");
            Mediator mediator = new ConcreteMediator(team, all);
            personA.setMediator(mediator);
            personB.setMediator(mediator);
            personC.setMediator(mediator);

            System.out.println("Asking: Leila to introduce everyone");
            personB.introduceEveryone();
            System.out.println("Asking: Tom to introduce the team");
            personA.introduceTheTeam();
        }
    }