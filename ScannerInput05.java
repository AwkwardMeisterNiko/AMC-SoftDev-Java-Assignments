package scannerinput05;

import java.util.Scanner;
public class ScannerInput05 {

    public static void main(String[] args) {
        double Fahr;
        int prompt;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please insert Fahrenheit temperature: ");
        Fahr=input.nextDouble();
        System.out.println("The temperature in Celsius is: ");
        System.out.println(((Fahr-32)*5)/9 );
        
        System.out.println("Would you like to insert another temperature(1/0)?: ");
        prompt=input.nextInt();
        
        if (prompt==1) {
            
        System.out.println("Please insert Fahrenheit temperature: ");
        Fahr=input.nextDouble();
        System.out.println("The temperature in Celsius is: ");
        System.out.println(((Fahr-32)*5)/9 );
        
        System.out.println("Would you like to insert another temperature(1/0)?: ");
        prompt=input.nextInt();
        
        if (prompt==1) {
            
        System.out.println("Please insert Fahrenheit temperature: ");
        Fahr=input.nextDouble();
        System.out.println("The temperature in Celsius is: ");
        System.out.println(((Fahr-32)*5)/9 );
            
        }
        
            else if (prompt==0) {
            System.out.println("Thank you for using this program :D ");
        }
            
        }
        
        else if (prompt==0) {
            System.out.println("Thank you for using this program :D ");
        }
      
    }
    
}
