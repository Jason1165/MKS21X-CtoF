/* The functions should have one parameter which is the value to be converted.
The parameter should be a double and the functions should return a double.
This is since 5/9 of something requires digits after the decimal point.
*/

//Code that turns Fahrenheit into Celsius and vice versa

public class CtoFTester{
  public static void main(String[] args) {
    // statements to test
    System.out.println(celsiusToFahrenheit(0.0));
    System.out.println(celsiusToFahrenheit(-40));
    System.out.println(fahrenheitToCelcius(32));
    System.out.println(fahrenheitToCelcius(-40));
  }

  public static double celsiusToFahrenheit(double c) {
    double fahrenheit = ((9.0/5.0)*c) + 32;
    return fahrenheit;
  }

  public static double fahrenheitToCelcius(double f) {
    double celsius = (5.0/9.0)*(f-32);
    return celsius;
  }
}
