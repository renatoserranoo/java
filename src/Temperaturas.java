import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner temperature = new Scanner(System.in);
        Double Celsius, Fahrenheit, Kelvin;

        System.out.println("Digite a temperatura em Celsius: ");
        Celsius = temperature.nextDouble();
        Fahrenheit = Celsius * 1.8 + 32;
        Kelvin = Celsius + 273;
        System.out.println("temperatura em Fahrenheit: " + Fahrenheit + "℉");
        System.out.println("temperatura em Kelvin: " + Kelvin + "K");
    }
}
