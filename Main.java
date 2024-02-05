import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TemperatureConverter tc = new TemperatureConverter();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Mahitha's Temperature converter");

        System.out.print("Enter the temperature value: ");
        double inputValue = scan.nextDouble();

        System.out.println("Select the input scale (C, F, K): ");
        String inputScale = scan.next();

        double centigrade;
        double fahrenheit;
        double kelvin;
        System.out.println("mahitha's Temperature Conversion Results:");
        switch (inputScale) {
            case "F":
                centigrade = tc.convertFtoC(inputValue);
                kelvin = tc.convertCtoK(centigrade);
                System.out.println("Centigrade: " + centigrade + " C");
                System.out.println("Kelvin: " + kelvin + " K");
                break;
            case "K":
                centigrade = tc.convertKtoC(inputValue);
                fahrenheit = tc.convertCtoF(centigrade);
                System.out.println("Centigrade: " + centigrade + " C");
                System.out.println("Fahrenheit: " + fahrenheit + " F");
                break;
            case "C":
                centigrade = inputValue;
                fahrenheit = tc.convertCtoF(centigrade);
                kelvin = tc.convertCtoK(centigrade);
                System.out.println("Fahrenheit: " + fahrenheit + " F");
                System.out.println("Kelvin: " + kelvin + " K");
                break;
        }

    }
}
