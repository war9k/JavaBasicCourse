package Homework6;

public class Star extends StarSystem {
    boolean isAtmosphere;
    double weight;

    public Star(String nameSystem, int numberOfSystem, boolean isAtmosphere, double weight) {
        super(nameSystem, numberOfSystem);
        this.isAtmosphere = isAtmosphere;
        this.weight = weight;
    }

    public void printHasAtmosphere() {
        System.out.println(isAtmosphere);
    }

    public void printWeightOfStar() {
        System.out.println(weight);
    }

    @Override
    public void printAll() {
        System.out.printf("Is Atmosphere %s, weight", isAtmosphere, weight);
    }

//    public int hashCode(){
//        return (int) (((null==isAtmosphere)?0:isAtmosphere.hashCode()));
//    }

    public String toString() {
        return getClass().getName() + "@" + " isAtmosphere: " + isAtmosphere + " weight: " + weight;
    }
}
