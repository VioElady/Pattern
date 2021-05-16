package behavioralPatterns.Observer.variants;

import behavioralPatterns.Observer.Observer;
import behavioralPatterns.Observer.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Concrete implementation for ChangeManager
 */
public class ConcreteChangeManager implements ChangeManager {

    Map<Subject, List<Observer>> mapping;

    public ConcreteChangeManager(){
        mapping = new HashMap<Subject, List<Observer>>();
    }

    @Override
    public void register(Subject subject, Observer observer){
        if(mapping.containsKey(subject)){
            mapping.get(subject).add(observer);
        }
        else{
            mapping.put(subject, new ArrayList<Observer>(Arrays.asList(observer)));
        }
    }

    @Override
    public void unregister(Subject subject, Observer observer){
        if(mapping.containsKey(subject)){
            if(mapping.get(subject).contains(observer)){
                mapping.get(subject).remove(observer);
            }
        }
    }

    @Override
    public void notifyObservers(Subject subject){
        for (Observer observer : mapping.get(subject)) {
            observer.update(subject);
        }
    }
}