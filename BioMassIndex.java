package biomassindex;
import java.util.Scanner;
import java.math.*;
public class BioMassIndex {

    public static void main(String[] args) {
       double Height;
       double Weight;
       double BMI;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please insert height in meters (Use a comma): ");
       Height=input.nextDouble();
       
       System.out.println("Please insert weight in kilos: (Use a comma): ");
       Weight=input.nextDouble();
       
       System.out.println("Your BMI is: ");
       BMI=(Weight/Math.pow(Height,2));
       System.out.println(BMI);
       
       if (BMI<18.5) {
           System.out.println("Underweight");
       }
       
       else if (BMI>=18.5 & BMI<25) {
           System.out.println("Normal Range");
       }
       
       else if (BMI>=25 & BMI<30) {
           System.out.println("Overweight");
       }
       
       else {
           System.out.println("Obese");
       }
       
       
    }
    
}
