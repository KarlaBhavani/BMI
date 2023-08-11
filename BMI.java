import java.util.Scanner;

public class BMI {
    double bmi;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
             System.out.println("Overweight");
        } else {
          System.out.println("Obese");
        }
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
