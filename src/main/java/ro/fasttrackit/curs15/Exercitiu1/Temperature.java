package ro.fasttrackit.curs15.Exercitiu1;

public class Temperature {

    public double celsiusToFahrenheit(double celsiusTemp){
        double fahrenheitTempt= celsiusTemp*9/5 + 32;
        return fahrenheitTempt;
    }

    public double fahrenheitToCelsius(double fahrenheitTemp){
        double celsiusTempt= (fahrenheitTemp-32)*5/9;
        return celsiusTempt;
    }


}
