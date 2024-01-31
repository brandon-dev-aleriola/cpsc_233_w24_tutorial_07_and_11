
public class RelativeTemperatureDisplay {

    public static void main(String[] args) {
        double temperatureInCelsius = -36.0;
        int windSpeed = 12; // km/h
        double windChill = (windSpeed *= -1) +1; // convert to negative value and add +1
        double feelsLike = temperatureInCelsius + windChill;
        double feelsLikeFahrenheit = (feelsLike * 9/5) + 32.00;
        System.out.println("Current Temperature: "+ temperatureInCelsius + " Celsius");
        System.out.println("Wind Chill: "+ windChill);
        System.out.println("Feels Like: "+ feelsLike);
        System.out.format("Feels like Fahrenheit Equivalen: %5.1f", feelsLikeFahrenheit);
    }
}