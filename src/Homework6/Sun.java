package Homework6;

public class Sun extends Star {
    int brightness;
    int radius;

    public Sun(String nameSystem, int numberOfSystem, boolean isAtmosphere, double weigh, int brightness, int radius) {
        super(nameSystem, numberOfSystem, isAtmosphere, weigh);
        this.brightness = brightness;
        this.radius = radius;
    }

    @Override
    public void printAll() {
        System.out.printf("Brightness %d, radius %d", brightness, radius);
    }

    public int hashCode() {
        return (int) (31 * brightness + 31 * radius);
    }

    public String toString() {
        return getClass().getName() + "@" + " brightness: " + brightness + " radius: " + radius;
    }
}
