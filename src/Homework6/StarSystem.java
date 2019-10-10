package Homework6;

public abstract class StarSystem {
    String nameSystem;
    int numberOfSystem;

    public StarSystem(){

    }

    public StarSystem(String nameSystem, int numberOfSystem){
        this.nameSystem=nameSystem;
        this.numberOfSystem=numberOfSystem;
    }

    public abstract  void printAll();
}
