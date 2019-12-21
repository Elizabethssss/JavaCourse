public class TemperatureConverter {
    public double convertFtoC(double degreesFahrenheit) {
        return (degreesFahrenheit - 32.0) / 9.0 * 5.0;
    }
    public double convertCtoF(double degreesCelsius) {
        return degreesCelsius / 5.0 * 9.0 + 32.0;
    }
    public double convertCtoK(double degreesCelsius) {
        return degreesCelsius + 273.2;
    }
    public double convertKtoC(double kelvin) {
        return kelvin - 273.2;
    }
    public double convertFtoK(double degreesFahrenheit) {
        return (degreesFahrenheit + 459.7) / 9.0 * 5.0;
    }
    public double convertKtoF(double kelvin) {
        return kelvin / 5.0 * 9.0 - 459.7;
    }
}