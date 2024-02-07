
public class TemperatureConverter {

// Hi, this is Mahitha, and it is my Fahreinheit to Centigrade conversion code.
    public double convertFtoC(double fahreinheit) { 
        return (fahreinheit - 32) * 5/9;
    }
// This is my Kelvin to Centigrade conversion code.
    public double convertKtoC(double kelvin) {
        return (kelvin - 273.15);
    }
// This is my centigrade to Fahreinheit conversion code.
    public double convertCtoF(double centigrade) {
        return (centigrade * 9 / 5) + 32;
    }
// This is my centigrade to Kelvin conversion code.
    public double convertCtoK(double centigrade) {
        return (centigrade + 273.15);
    }
}
