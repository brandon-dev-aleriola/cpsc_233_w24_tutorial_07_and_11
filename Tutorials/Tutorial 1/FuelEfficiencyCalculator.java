
import java.util.Scanner;

public class FuelEfficiencyCalculator {
    static final double KILOMETERS = 100.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter liters of fuel used: ");
        String fuelUsed = scanner.nextLine();
        double dFuelUsed = Double.parseDouble(fuelUsed);
        System.out.print("Enter distance travelled in kilometers: ");
        String distanceTravelled = scanner.nextLine();
        double ddistanceTravelled = Double.parseDouble(distanceTravelled);
        double distanceBy100km = ddistanceTravelled / KILOMETERS;
        double efficiency = dFuelUsed / distanceBy100km;
        System.out.println("Efficiency is: " + efficiency + " L/100 km"); // unformatted double
        //System.out.format("Efficiency is: %5.2f L/100 km", efficiency);
    }
}