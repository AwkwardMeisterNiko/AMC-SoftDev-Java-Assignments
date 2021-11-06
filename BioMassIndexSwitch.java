package biomassindexswitch;
import java.util.Scanner;

public class BioMassIndexSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int NumInput;
        System.out.println("Welcome to the BMI program!");
        System.out.println("\nEntering [1] provides the BMI range for Underweight");
        System.out.println("\nEntering [2] provides the BMI range that is considered normal");
        System.out.println("\nEntering [3] provides the BMI range for Overweight");
        System.out.println("\nEntering [4] provides the BMI range for Obese");
        System.out.println("\nPlease provide one of the numbers displayed above: ");
        
        NumInput=input.nextInt();
        switch (NumInput){
            case 1:
                System.out.println("The BMI that corresponds to underweight is any value under 18.5");
                break;
            case 2:
                System.out.println("The BMI that corresponds to the normal range is any value ranging from 18.5 up to 24.9");
                break;
            case 3:
                System.out.println("The BMI that corresponds to overweight is any value ranging from 25 up to 29.9");
                break;
            case 4:
                System.out.println("The BMI that corresponds to obese is any value equal or over 30");
                break;
            default:
                System.out.println("\nInvalid input");
            
    }
    }
    
}
