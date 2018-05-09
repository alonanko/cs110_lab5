package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Celsius temp = new Celsius(getValue());

        return temp ;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit temp;
        float val = (((getValue() * 9) / 5) + 32);
        temp = new Fahrenheit(val);

        return temp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue() + " C";
    }
}