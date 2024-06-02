public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayDevice displayDevice = new DisplayDevice();
        AlertSystem alertSystem = new AlertSystem();

        weatherStation.registerObserver(displayDevice);
        weatherStation.registerObserver(alertSystem);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(32);
    }
}
