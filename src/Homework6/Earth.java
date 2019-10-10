package Homework6;

public class Earth extends Planet {
    private long numberOfPeople;
    private String nameOfSatellite;
    private int numberOfSatellite;

    public void printAllEarthInfo() {
        String massage = String.format("There are %s satellites of Earth,  which one of them %s ", numberOfSatellite, nameOfSatellite);
        System.out.println(massage);
    }

    public void printNumberOfPeople() {
        System.out.println("A number of people on the Earht " + numberOfPeople);
    }

    public Earth(int numberOfSatellite, int numberOfPeople) {
        this.numberOfSatellite = numberOfSatellite;
        this.numberOfPeople = numberOfPeople;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getNameOfSatellite() {
        return nameOfSatellite;
    }

    public void setNameOfSatellite(String nameOfSatellite) {
        this.nameOfSatellite = nameOfSatellite;
    }

    public int getNumberOfSatellite() {
        return numberOfSatellite;
    }

    public void setNumberOfSatellite(int numberOfSatellite) {
        this.numberOfSatellite = numberOfSatellite;
    }

    @Override
    public void printAll() {
        System.out.println();
    }

    public int hashCode() {
        return (int) (31 * numberOfPeople + 31 * numberOfSatellite + ((null == nameOfSatellite) ? 0 : nameOfSatellite.hashCode()));
    }

    public String toString() {
        return getClass().getName() + "@" + " numberOfPeople: " + numberOfPeople + " numberOfSatellite: " + numberOfSatellite + " nameOfSatellite: " + nameOfSatellite;
    }
}
