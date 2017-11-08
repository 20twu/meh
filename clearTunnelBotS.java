/*
 * Give your Name here:
 * Run the main method so you can visually see the problem you need to solve
 * An instance of clearTunnelBotS is facing a tunnel that has at least one Thing on each intersection.
 * When given the clearTunnel command, the robot should remove all the Things, placing them at the head of the tunnel.
 * No Empty Trips!
 * The robot may carry at most one Thing at a time and may not make any trips back to the tunnel once all the Things have been removed.
 * The robot will always start with a wall behind it, marking where the things should be placed.
 * The distance to the tunnel and the lenght of the tunnel may vary.
 * See Mr. Campbell's exemplar to understand the initial and end situations.
 * Code you will need includes:
 * && is the operator for "and"; it is used to test on more than one condition. You almost certainly will need it.
 * canPickThing()
 * pickThing()
 * putThing()
 * frontIsClear()
 * ! to negegate (eg., !this.frontIsClear() means the front is NOT clear)
 * loops (go look at loopy if you can't remember)
 */
 
import becker.robots.*;

//Some of the work has been done for you.  clearTunnelBotS already extends RobotSE and the superclass has been initialized.
public class clearTunnelBotS extends RobotSE
{

public clearTunnelBotS (City aCity, int aStreet, int anAvenue, Direction aDir, int numThings)
   {    super(aCity, aStreet, anAvenue, aDir, numThings);
   }

   
   //the clearTunnel() method has been started that you might like to use
   //BIG HINT: Do NOT try to solve this with one method!
   //Instead, break down the task into smaller parts and have clearTunnel() call those parts
   //In other words, create an algorithm
   public void clearTunnel()
  {   
      //If it can't pick up somethin and the front is clear, move foward until you can pick something up.
      if(!this.canPickThing()&&this.frontIsClear())
      {while(!this.canPickThing())
       {this.move();
        }
      }
      //If you can pick something up or the front isn't clear, turn around and move foward by one unit, then move until you can pick something up.
      else
      {this.turnAround();
       this.move();
       while(!this.canPickThing())
       {this.move();
        }
      }
      //If you can pick something up, but the front isn't clear, pick up the thing and turn around.
      if(this.canPickThing()&&!this.frontIsClear())
      {this.pickThing();
       this.turnAround();
       //If you still can pick something up, move until you hit a wall, put the thing down, and run the method clearTunnel.
       if(this.canPickThing())
       {
        while(this.frontIsClear())
        {this.move();
         }
        if(!this.frontIsClear())
        {this.putThing();
         }
        this.clearTunnel();
       }
       //If you can't pick anything up anymore, move until you hit a wall, and put the thing down.
       else
       {
       while(this.frontIsClear())
       {this.move();
        }
       if(!this.frontIsClear())
        {this.putThing();
         }
       }
       }
      //If you cannot pick something up or the front is clear, pick up the thing, turn around, move until you hit the wall, put down the thing and run the method clearTunnel.
      else
      {this.pickThing();
       this.turnAround();
       while(this.frontIsClear())
       {this.move();
        }
       if(!this.frontIsClear())
        {this.putThing();
         }
       this.clearTunnel();
       }
      }
   public static void main(String[] args)
  {    City warsaw = new City(6,12);
        warsaw.showThingCounts(true);
        
      Wall Wall1 = new Wall (warsaw, 1, 1, Direction.WEST);
      Wall Wall2 = new Wall (warsaw, 1, 3, Direction.NORTH);
      Wall Wall3 = new Wall (warsaw, 1, 4, Direction.NORTH);
      Wall Wall4 = new Wall (warsaw, 1, 5, Direction.NORTH);
      Wall Wall5 = new Wall (warsaw, 1, 6, Direction.NORTH);
      Wall Wall6 = new Wall (warsaw, 1, 7, Direction.NORTH);
      Wall Wall7 = new Wall (warsaw, 1, 3, Direction.SOUTH);
      Wall Wall8 = new Wall (warsaw, 1, 4, Direction.SOUTH);
      Wall Wall9 = new Wall (warsaw, 1, 5, Direction.SOUTH);
      Wall Wall10 = new Wall (warsaw, 1, 6, Direction.SOUTH);
      Wall Wall11 = new Wall (warsaw, 1, 7, Direction.SOUTH);
      Wall Wall12 = new Wall (warsaw, 1, 7, Direction.EAST);
      
      Thing Thing1 = new Thing (warsaw, 1, 3);
      Thing Thing2 = new Thing (warsaw, 1, 4);
      Thing Thing3 = new Thing (warsaw, 1, 5);
      Thing Thing4 = new Thing (warsaw, 1, 5);
      Thing Thing5 = new Thing (warsaw, 1, 5);
      Thing Thing6 = new Thing (warsaw, 1, 6);
      Thing Thing7 = new Thing (warsaw, 1, 6);
      Thing Thing8 = new Thing (warsaw, 1, 7);
      
      Wall Wall13 = new Wall (warsaw, 4, 1, Direction.WEST);
      Wall Wall15 = new Wall (warsaw, 4, 4, Direction.NORTH);
      Wall Wall16 = new Wall (warsaw, 4, 5, Direction.NORTH);
      Wall Wall17 = new Wall (warsaw, 4, 6, Direction.NORTH);
      Wall Wall20 = new Wall (warsaw, 4, 4, Direction.SOUTH);
      Wall Wall21 = new Wall (warsaw, 4, 5, Direction.SOUTH);
      Wall Wall22 = new Wall (warsaw, 4, 6, Direction.SOUTH);
      Wall Wall24 = new Wall (warsaw, 4, 6, Direction.EAST);
      

      Thing Thing9 = new Thing (warsaw, 4, 4);
      Thing Thing10 = new Thing (warsaw, 4, 5);
      Thing Thing11 = new Thing (warsaw, 4, 5);
      Thing Thing12 = new Thing (warsaw, 4, 5);
      Thing Thing13 = new Thing (warsaw, 4, 6);
      Thing Thing14 = new Thing (warsaw, 4, 6);


      //the objects are made are made for you
      clearTunnelBotS hauler1 = new clearTunnelBotS(warsaw, 1, 1, Direction.EAST,0);
      clearTunnelBotS hauler2 = new clearTunnelBotS(warsaw, 4, 1, Direction.EAST,0);
      

      hauler1.setLabel("1");
      hauler2.setLabel("2");
      
      hauler1.setSpeed(5);
      hauler2.setSpeed(5);
      
      //objects already calling the clearTunnel() method
      hauler1.clearTunnel();
      hauler2.clearTunnel();
    }
}


       
