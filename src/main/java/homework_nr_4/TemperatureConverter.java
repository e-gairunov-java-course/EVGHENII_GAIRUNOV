package homework_nr_4;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        float i = -40;
        System.out.println(i + " degrees in Fahrenheit is " + tc.toCelsius(i) + " degrees in Celsius.");
        i = 40;
        System.out.println(i + " degrees in Celsius is " + tc.toFahrenheit(i) + " degrees in Fahrenheit.");
    }
    public float toCelsius(float fahrenheit){
        return 5.0F / 9.0F * (fahrenheit - 32);
    }
    public float toFahrenheit(float celsius){
        return (float) (1.8 * celsius + 32);
    }
}
