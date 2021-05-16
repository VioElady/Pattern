package behavioralPatterns.Observer.variants;

import behavioralPatterns.Observer.Observer;
import behavioralPatterns.Observer.Subject;
/**
 * Abstract interface for change manager classes, whose responsibilites are
 * to track down the mapping among Subjects and Observers and to implement
 * specific notification policies
 */
public interface ChangeManager {

    public abstract void register(Subject subject, Observer observer);

    public abstract void unregister(Subject subject, Observer observer);

    public abstract void notifyObservers(Subject subject);

}
