package Homework6;

public class Main {

    public static void main(String[] args) {
                Earth earth = new Earth(5, 7800000);
        earth.printAllEarthInfo();
        System.out.println(earth.getNumberOfPeople());

        Sun sun = new Sun("Sun System", 5, true, 500, 700, 9675);
        System.out.println(sun.toString());
        System.out.println(sun.hashCode());
        sun.printAll();

        System.out.println();
        System.out.println();

        Star star = new Star("Sun System", 2, true, 3.25);
        star.printAll();
        System.out.println();
        System.out.println(star.hashCode());
        System.out.println(star.toString());

        System.out.println();

        Planet planet = new Planet("ALFA", 50, "Gold", 5047);
        planet.printAll();
        System.out.println();
        System.out.println(planet.toString());
        System.out.println(planet.hashCode());
        planet.print();

    }
}
