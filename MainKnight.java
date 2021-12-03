package Knight;


public class MainKnight {
    
    
public static void main(String[] args) {
    Knight k1 = new Knight();
    Knight k2= new Knight();
    k1.id=00;
    k2.id=01;
    k1.hp=200;
    k2.hp=-200;
    k1.ap=40;
    k2.ap=48;
    
    k1.print();//print stats for k1
    k2.print();//print stats for k2
    k1.GameOver();//print if defeated
    k2.GameOver();//print if defeated
}
}