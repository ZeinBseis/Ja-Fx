package DesignPatterns.observer.SimpleWeatherStation;


public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65);
        Observer on = new CurrentConditionsDisplay(weatherData);
        weatherData.registerObserver(on);
        weatherData.setMeasurements(88,70);
        weatherData.notifyObservers();

    }
}
