package prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
  //method that return copy this project
    Project cloneProject() {
        return (Project) project.copy();
    }
}
