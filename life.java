
import becker.robots.*;


public class life extends prelife{
    public life(City aCity, int aStreet, int anAvenue, Direction aDir, int numThings){
        super (aCity, aStreet, anAvenue, aDir, numThings);
    }
    boolean addiction = false;
    boolean living = false;
    
    int money = 0;
    int intel = 0;
    
    public void getBorn()
    
     {   this.parents();
        if(parent == 5)
        {
            money += 200000;
        }
        if(parent == 4)
        {
            money += 100000;
        }
        
        if(this.parent == 2)
        {
            money-=100000;
        }
        if(this.parent == 1)
        {
            money-= 200000;
            addiction = true;
        }
        living = true;
      }
     public void goToSchool()
     {
        for(int year = 0; year<12; year++)
        {
            if(money>0)
            {this.privateSchool();
            }
            else{
                if(money>-100001)
                {this.publicSchool();
                }
                else{
                    this.work();
                }
        }
     }
     
     }
     public void findWork()
     {
       
     }
   
   
      public static void main(String[] arg){
        City warsaw = new City(6,12);
        warsaw.showThingCounts(true);
          
        life John = new life(warsaw, 1, 1, Direction.EAST,0);
        John.getBorn();
        John.goToSchool();
        }

   }


