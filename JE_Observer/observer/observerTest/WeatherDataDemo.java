package observerTest;

public class WeatherDataDemo {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(29f,65f,745);
        weatherData.setMeasurements(39f,70f,760);
        weatherData.setMeasurements(42f,72f,763);
    }
}
