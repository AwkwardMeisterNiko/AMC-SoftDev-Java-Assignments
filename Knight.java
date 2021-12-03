package Knight;

public class Knight {
  double hp;  
  double ap;
  int id;
  
  public void print(){
    System.out.println("<Knight ID>:\n " + id);
    System.out.println("<Knight HP>:\n " + hp);
    System.out.println("<Knight AP>:\n " + ap);
  }
  public void GameOver(){  //Method for if defeated
    if(hp<=0){  
     System.out.println("The knight has been defeated"); 
     System.out.println("Game over");
    }
  }
}
