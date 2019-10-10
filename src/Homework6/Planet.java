package Homework6;

public class Planet extends StarSystem {
    String nameOfPlanet;
    int distanceOfSun;

    public void printAllPlanetInfo() {
        System.out.println("Name of Planet" + nameOfPlanet);
        System.out.println("Distance of Sun" + distanceOfSun);
    }

    public Planet() {
    }

    public Planet(String nameOfPlanet) {
        this.nameOfPlanet = nameOfPlanet;
    }

    public Planet(String nameSystem, int numberOfSystem, String nameOfPlanet, int distanceOfSun) {
        super(nameSystem, numberOfSystem);
        this.nameOfPlanet = nameOfPlanet;
        this.distanceOfSun = distanceOfSun;
    }

    public void print() {
        System.out.println(nameOfPlanet);
        System.out.println(distanceOfSun);
        System.out.println(numberOfSystem);
        System.out.println(nameSystem);
    }

    @Override
    public void printAll() {
        System.out.printf("nameOfPlanet %s, distanceOfSun %d", nameOfPlanet, distanceOfSun);
    }

    public int hashCode() {
        return (int) (31 * distanceOfSun + ((null == nameOfPlanet) ? 0 : nameOfPlanet.hashCode()));
    }

    public String toString() {
        return getClass().getName() + "@" + " distanceOfSun: " + distanceOfSun + " nameOfPlanet: " + nameOfPlanet;
    }
}
