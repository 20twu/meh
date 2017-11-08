/*
 * Give your Name here:
 * Run the main method so you can visually see the problem you need to solve
 * An instance of clearTunnelBot is facing a tunnel that has at least one Thing on each intersection.
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

//Some of the work has been done for you.  clearTunnelBot already extends RobotSE and the superclass has been initialized.
public class clearTunnelBot extends RobotSE
{

public clearTunnelBot (City aCity, int aStreet, int anAvenue, Direction aDir, int numThings)
   {    super(aCity, aStreet, anAvenue, aDir, numThings);
   }
   
   //you'll likely need this boolean; think of it as a "switch"
   boolean getAnother = true;
   
   //the clearTunnel() method has been started that you might like to use
   //BIG HINT: Do NOT try to solve this with one method!
   //Instead, break down the task into smaller parts and have clearTunnel() call those parts
   //In other words, create an algorithm
     public void clearTunnel()
  {   
      //telling robot to move forward until either there is a Thing or there is a wall in front
      while(!this.canPickThing()/*&&this.frontIsClear()*/)
       {this.move();
        }
        //pick up the thing
      this.pickThing();
        //Testing if this is the last thing in the tunnel
      if(!this.canPickThing()&&!this.frontIsClear())
      { getAnother = false;
        }
        else{}
        //Turn around
      this.turnAround();
        //Move back to start
      while(this.frontIsClear())
      {this.move();
        }
            //put down thing
      this.putThing();
            //turn around to prepare for another run
      this.turnAround();
            //move forward so that it doesn't mess with first while loop
      this.move();
            //Makes method call on itself again if boolean is true
      if(getAnother == true){
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
      clearTunnelBot hauler1 = new clearTunnelBot(warsaw, 1, 1, Direction.EAST,0);
      clearTunnelBot hauler2 = new clearTunnelBot(warsaw, 4, 1, Direction.EAST,0);
      

      hauler1.setLabel("1");
      hauler2.setLabel("2");
      
      hauler1.setSpeed(5);
      hauler2.setSpeed(5);
      //Testing, testing
      //objects already calling the clearTunnel() method
      hauler1.clearTunnel();
      hauler2.clearTunnel();
  }
       



}


       
