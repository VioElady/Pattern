package creationalPatterns.singletonImplem;

//In inițializarea dornică, instanța Class Singleton este creată la momentul încărcării clasei,
// aceasta este cea mai ușoară metodă de a crea o clasă singleton,
//dar are un dezavantaj că instanța este creată chiar dacă aplicația client nu ar putea să o folosească.


public class EagerInitializedRegion {

    private static final EagerInitializedRegion INSTANCE = new EagerInitializedRegion(741, "million");

    private int population;
    private String unit;

    private EagerInitializedRegion(int population, String unit) {
        this.population = population;
        this.unit = unit;
    }

    public static EagerInitializedRegion getInstance() {
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
