package scannerinput02;

import java.util.Scanner;

public class ScannerInput02 {


    public static void main(String[] args) {
        int a;
        int b;
        int c;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("\nPlease provide an int number for a: ");
        a=input.nextInt();
        
        System.out.println("\nPlease provide an int number for b: ");
        b=input.nextInt();
        
        System.out.println("\nPlease provide an int number for c: ");
        c=input.nextInt();
        
        System.out.println("\nThe function solution for F(x)=2a+3b+4c is as follows:");
        System.out.println((2*a)+(3*b)+(4*c));
        
        System.out.println("\nThe function solution for F(x)=(a+3b)*(4c-3a) is as follows:");
        System.out.println((a+(3*b))*((4*c)-(3*a)));
        
         System.out.println("\nThe function solution for F(x)=(a+3b)2*(4c-3a) is as follows:");
         System.out.println(((a+(3*b))*2)*((4*c)-(3*a)));
    }
    
}
