package singletonImplem;
//Modelul Singleton restricționează instanțierea unei clase și asigură
// existența unei singure instanțe a clasei în mașina virtuală java.
//Clasa singleton trebuie să furnizeze un punct de acces global pentru a obține instanța clasei.

public class Main {
    public static void main(String[] args) {
        // write your code here

        StaticBlockRegion regionStatic1 = StaticBlockRegion.INSTANCE;
        StaticBlockRegion regionStatic2 = StaticBlockRegion.INSTANCE;
        regionStatic1.setPopulation(300);
        System.out.println(regionStatic1 + " population " + regionStatic1.getPopulation()+ " " +regionStatic1.getUnit());
        System.out.println(regionStatic2 + " population " + regionStatic2.getPopulation()+ " " +regionStatic2.getUnit());
        System.out.println("################################################");

        EagerInitializedRegion regionEager1 = EagerInitializedRegion.getInstance();
        EagerInitializedRegion regionEager = EagerInitializedRegion.getInstance();
        regionEager1.setPopulation(200);
        System.out.println(regionEager1 + " population " + regionEager1.getPopulation()+ " " +regionEager1.getUnit());
        System.out.println(regionEager + " population " + regionEager.getPopulation()+ " " +regionEager.getUnit());
        System.out.println("################################################");

        EnumRegion regionEnum1 = EnumRegion.INSTANCE;
        EnumRegion regionEnum2 = EnumRegion.INSTANCE;
        regionEnum1.setPopulation(2.33);
        System.out.println(Integer.toHexString(regionEnum1.hashCode()) + " population " + regionEnum1.getPopulation()+ " " +regionEnum1.getUnit());
        System.out.println(Integer.toHexString(regionEnum2.hashCode()) + " population " + regionEnum2.getPopulation()+ " " +regionEnum2.getUnit());


    }
}

