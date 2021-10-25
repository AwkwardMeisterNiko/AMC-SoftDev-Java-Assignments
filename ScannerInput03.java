package scannerinput03;

import java.util.Scanner;

public class ScannerInput03 {
    
    public static void main(String[] args) {
    double dec1;
    double dec2;
    double dec3;
    
    Scanner input = new Scanner (System.in);
    
    System.out.println("\nPlease input first dec number: ");
    dec1=input.nextDouble();
       
    System.out.println("\nPlease input second dec number: ");
    dec2=input.nextDouble();
    
    System.out.println("\nPlease input third dec number: ");
    dec3=input.nextDouble();
    
    System.out.println("\nThe result is: ");
    System.out.println(dec1 + dec2 + dec3);
    System.out.println("\nAll of the 3 numbers were added");
    }
    
}
