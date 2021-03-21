package creationalPatterns.singletonImplem;
//Implementarea inițializării blocului static este similară inițializării dornice,
//cu excepția faptului că instanța clasei este creată în blocul static care oferă opțiune pentru gestionarea excepțiilor.

public class StaticBlockRegion {

    public static StaticBlockRegion INSTANCE;

    private int population;
    private String unit;

    private StaticBlockRegion(int population, String unit) {
        this.population = population;
        this.unit = unit;
    }

    static {
        try {
            INSTANCE = new StaticBlockRegion(741, "million");
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockRegion getInstance() {
        return INSTANCE;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


}