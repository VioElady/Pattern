package prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"SuperProject","SourceCode sourcecode = new SourceCode();");
        System.out.println(master);
           //method 1
        ProjectFactory factory = new ProjectFactory(master); //where to receive my project master in constructor.
        Project masterClone = factory.cloneProject(); //Cloner my project master that receive my ProjectFactory in new object(masterCloner).
        System.out.println(masterClone);

        //method 2
        Project masterClone2 = (Project) master.copy(); //need to show type this project.
        System.out.println(masterClone2);


    }   
}
