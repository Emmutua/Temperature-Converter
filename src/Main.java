
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        System.out.println("(1) Fahrenheit to Celsius (2) Celsius to Fahrenheit");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        if(choice == 1){
            System.out.println("Fahrenheit to Celsius, Enter Value");
            double value = in.nextDouble();
            fahrenToCelcius ob = new fahrenToCelcius(value);
            ob.convert();

        } else if (choice == 2) {
            System.out.println("Celsius to Fahrenheit, Enter value");
            double value = in.nextDouble();
            celciusToFahren ob = new celciusToFahren(value);
            ob.convert();

        }else {
            System.out.println("Invalid Input");
        }

    }
}