package scannerinput04;

import java.util.Scanner;

public class ScannerInput04 {


    public static void main(String[] args) {
        double dec1;
        double dec2;
        double dec3;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("\nPlease first dec number: ");
        dec1=input.nextDouble();
        
        System.out.println("\nPlease second dec number: ");
        dec2=input.nextDouble();
        
        System.out.println("\nPlease third dec number: ");
        dec3=input.nextDouble();
        
        System.out.println("\nThe addition result is: ");
        System.out.println(dec1 + dec2 + dec3);
        
        System.out.println("\nThe mean is: ");
        System.out.println((dec1+dec2+dec3)/3);
      
    }
    
}
