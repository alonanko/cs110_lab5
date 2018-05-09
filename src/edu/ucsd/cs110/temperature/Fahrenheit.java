package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Celsius temp;
        float val = (getValue()-32)*5/9;
        temp = new Celsius(val);

        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit temp = new Fahrenheit(getValue());
        return temp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue() + " F";
    }
}