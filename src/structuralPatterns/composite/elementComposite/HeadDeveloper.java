package structuralPatterns.composite.elementComposite;
import structuralPatterns.composite.Developer;
import java.util.ArrayList;
import java.util.List;

public class HeadDeveloper implements Developer {

    private Integer id;
    private String name;

    private List<Developer> childDevelopers;

    public HeadDeveloper(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDevelopers = new ArrayList<>();
    }

    @Override
    public void printDeveloperType() {
        childDevelopers.forEach(Developer::printDeveloperType);
    }

    public void addDeveloper(Developer developer) {
        childDevelopers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        childDevelopers.remove(developer);
    }

}
