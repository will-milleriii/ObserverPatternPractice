public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {

    }

    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Forecast: ");
        if (currentPressure > lastPressure){
            System.out.println("Improving weather is on the way");
        } else if (currentPressure == lastPressure){
            System.out.println("Same old, same old");
        } else if (currentPressure < lastPressure){
            System.out.println("Looks like rain is on the way");
        }
    }
}
