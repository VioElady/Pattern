package singletonImplem;

//Java asigură că orice valoare enum este instanțiată o singură dată într-un program Java.
// Deoarece valorile Java Enum sunt accesibile la nivel global, la fel este singletonul.
//Dezavantajul este că tipul enum este oarecum inflexibil; de exemplu, nu permite inițializarea leneșă.


public enum EnumRegion {
    INSTANCE;
    private double population = 1.216 ;
    private String unit =" billion ";


    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
