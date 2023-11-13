public class TemperatureConverter {

    public double CelsiusToKelvin(int celsius) {
        return celsius + 273.15f;
    }

    public double CelsiusToFahrenheit(int celsius) {
        return (celsius*1.8f) + 32;
    }

    public double KelvinToCelsius(int kelvin) {
        return kelvin - 273.15f ;
    }

    public double KelvinToFahrenheit(int kelvin) {
        return (kelvin-273.15f) * 1.8 + 32;
    }

    public double FahrenheitToCelsius(int fahrenheit) {
        return (fahrenheit-32) * 0.5556f;
    }

    public double FahrenheitToKelvin(int fahrenheit) {
        return (fahrenheit-32) * 0.5556f + 273.15f;
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        System.out.println(temperatureConverter.CelsiusToFahrenheit(15));
        System.out.println(temperatureConverter.CelsiusToKelvin(10));
        System.out.println(temperatureConverter.FahrenheitToCelsius(60));
        System.out.println(temperatureConverter.FahrenheitToKelvin(80));
        System.out.println(temperatureConverter.KelvinToCelsius(250));
        System.out.println(temperatureConverter.KelvinToFahrenheit(240));
    }
}
