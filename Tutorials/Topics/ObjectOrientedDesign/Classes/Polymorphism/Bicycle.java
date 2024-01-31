package ObjectOrientedDesign.Classes.Polymorphism;

public class Bicycle {
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
    public void setGear(int newValue) {
        gear = newValue;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
    public void printDescription(){
        System.out.println("\nBike is " + "in gear " + this.gear
                + " with a cadence of " + this.cadence +
                " and travelling at a speed of " + this.speed + ". ");
    }
}

// Polymorphism

class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType){
        super(startCadence, startSpeed, startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension(){
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a" +
                getSuspension() + " suspension.");
    }
}

class RoadBike extends Bicycle{
    // In millimeters (mm)
    private int tireWidth;

    public RoadBike(int startCadence, int startSpeed, int startGear, int newTireWidth){
        super(startCadence, startSpeed, startGear);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth(){
        return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth){
        this.tireWidth = newTireWidth;
    }

    public void printDescription(){
        super.printDescription();
        System.out.println("The RoadBike" + " has " + getTireWidth() +
                " MM tires.");
    }
}

class TestBikes {
    public static void main(String[] args){
        Bicycle bike01, bike02, bike03;

        bike01 = new Bicycle(20, 10, 1);
        bike02 = new MountainBike(20, 10, 5, "Dual");
        bike03 = new RoadBike(40, 20, 8, 23);

        bike01.printDescription();
        bike02.printDescription();
        bike03.printDescription();
    }
//    Bike is in gear 1 with a cadence of 20 and travelling at a speed of 10.
//
//    Bike is in gear 5 with a cadence of 20 and travelling at a speed of 10.
//    The MountainBike has a Dual suspension.
//
//    Bike is in gear 8 with a cadence of 40 and travelling at a speed of 20.
//    The RoadBike has 23 MM tires.

//    The Java virtual machine (JVM) calls the appropriate method for the object that is referred to in each variable.
//    It does not call the method that is defined by the variable's type. This behavior is referred to as virtual
//    method invocation and demonstrates an aspect of the important polymorphism features in the Java language.
}