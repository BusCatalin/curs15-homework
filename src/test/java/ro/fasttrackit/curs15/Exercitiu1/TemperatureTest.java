package ro.fasttrackit.curs15.Exercitiu1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TemperatureTest {

    @Test
    @DisplayName("WHEN fahrenheit temperature is given THEN return celsius temperature")
    void testConversionToCelsius(){
        //SETUP
        Temperature temperature= new Temperature();
        //RUN
        double celsiusTemp = temperature.fahrenheitToCelsius(23);
        //ASSERT
        assertThat(celsiusTemp).isEqualTo(-5);

    }

    @Test @DisplayName("WHEN celsius temperature is given THEN return fahrenheit temperature")
    void testConversionToFahrenheit(){
        //SETUP
        Temperature temperature = new Temperature();
        //RUN
        double fahrenheitTemp= temperature.celsiusToFahrenheit(100);
        //ASSERT
        assertThat(fahrenheitTemp).isEqualTo(212);
    }
}
