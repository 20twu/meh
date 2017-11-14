import java.util.Random;
import becker.robots.*;
public class prelife extends RobotSE{
    
    public prelife (City aCity, int aStreet, int anAvenue, Direction aDir, int numThings)
    {    super(aCity, aStreet, anAvenue, aDir, numThings);
   }
    
    int intelligence;
    int money;
    Random rand = new Random();
    int parent;
    
    
    public void parents(){
        parent = rand.nextInt(5)+1;
    }
    public void privateSchool(){
     money -= 2000;
     intelligence += 5;
    }
    public void publicSchool(){
     intelligence +=2;
    }
    public void work(){
     money += 500;   
     intelligence +=1;
    }
    public void findWork(){}
}