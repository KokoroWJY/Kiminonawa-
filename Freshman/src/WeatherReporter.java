public class WeatherReporter {
    String weather;
    double temperature;

    WeatherReporter(String weather, double temperature) {
        this.weather = weather;
        this.temperature = temperature;
    }

    public String toString() {
        return "今天天气是" + weather + "温度是" + temperature;
    }

    public static void main(String[] args) {
        WeatherReporter we = new WeatherReporter("qing", 18);
        System.out.println(we.temperature);
    }
}
