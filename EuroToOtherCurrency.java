package eurotoothercurrency;
import java.util.Scanner;

public class EuroToOtherCurrency {
   
    public static void main(String[] args) {
        double EuroInput;
        Scanner input= new Scanner (System.in);
        
        System.out.println("Please insert Euro value (Please use a comma to specify cents): ");
        EuroInput=input.nextDouble();
        
        System.out.println("\nThe equivalent for the Georgian Lari is: ");
        System.out.println(EuroInput*3.64);
        
        System.out.println("\nThe equivalent for the CAD is: ");
        System.out.println(EuroInput*1.43);
        
        System.out.println("\nThe equivalent for the Japanese Yen is: ");
        System.out.println(EuroInput*131.71);
        
    }
    
}
