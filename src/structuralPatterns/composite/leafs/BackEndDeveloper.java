package structuralPatterns.composite.leafs;

import structuralPatterns.composite.Developer;

public class BackEndDeveloper implements Developer {
    private Integer id;
    private String name;

    @Override
    public void printDeveloperType() {
        System.out.println( getClass().getSimpleName() );
    }

    public BackEndDeveloper(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
