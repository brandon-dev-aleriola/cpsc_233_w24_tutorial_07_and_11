
public class RocketCountDown {


    public static void main(String[] args) {
        double fuelPricePerKilometer = 130000.00; // per 1km
        int distanceTravelledInMeters = 16000; //16,000m = 16km
        int timeOfFlightInSeconds = 32;
        double costOfTheRocket = 21463000.00;
        double fuelCost = (distanceTravelledInMeters / 1000.00) * fuelPricePerKilometer;
        double totalAssetCost = fuelCost + costOfTheRocket;
        double costPerSecond = totalAssetCost / timeOfFlightInSeconds;
        System.out.println("Three... Two... One... Zero... Liftoff!");
        System.out.println("Houston, we have a problem.");
        System.out.format("Houston, flight total cost was $%5.2f per second.", costPerSecond);
    }
}