import java.util.Scanner;

public class Weather {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Weather today = new Weather();

        today.setDirection(scan.next());
        today.setWind_speed(scan.nextDouble());
        today.setTemperature(scan.nextDouble());
        today.setCloudiness(scan.next());
        today.setPrecipitation(scan.nextDouble());

        today.getDirection();
        today.getWind_speed();
        today.getTemperature();
        today.getCloudiness();
        today.getPrecipitation();
    }

    String direction;
    double wind_speed;
    double temperature;
    String cloudiness;
    double precipitation;

    public void setDirection(String route) {
        direction = route;
    }

    public void setWind_speed(double speed) {
        wind_speed = speed;
    }

    public void setTemperature(double degrees) {
        temperature = degrees;
    }

    public void setCloudiness(String level) {
        cloudiness = level;
    }

    public void setPrecipitation(double percent) {
        precipitation = percent;
    }

    public String getDirection() {
        System.out.println("Direction : " + direction);
        return direction;
    }

    public double getWind_speed() {
        System.out.println("Wind speed : " + wind_speed);
        return wind_speed;
    }

    public double getTemperature() {
        System.out.println("Temperature : " + temperature);
        return temperature;
    }

    public String getCloudiness() {
        System.out.println("Cloudiness : " + cloudiness);
        return cloudiness;
    }

    public double getPrecipitation() {
        System.out.println("Precipitation : " + precipitation);
        return precipitation;
    }

}
