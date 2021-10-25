package scannerinput01;

import java.util.Scanner;

public class ScannerInput01 {
    
    public static void main(String[] args) {
        String DayName;
        String StartDay;
        String EndDay;
        String DaySubject;
      Scanner input = new Scanner (System.in);
      
        for (int i=0; i<3; i++) {
        System.out.println("Provide day: ");
        DayName=input.next();
       
        System.out.println("<Please provide for " + DayName + ">");
        
        System.out.print("\nPlease provide first hour: ");
        StartDay=input.next();
        
        System.out.print("\nPlease provide last hour: ");
        EndDay=input.next();
       
        System.out.print("\nPlease provide subject name (without spaces): ");
        DaySubject=input.next();
        
        System.out.println("Day: " + DayName + " First hour: " + StartDay + " Last hour: " + EndDay + " Subject: " + DaySubject);
        }
    }
    
}