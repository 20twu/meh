public class life extends prelife{
    boolean addiction = false;
    boolean life = false;
    public void getBirthed()
    {   this.parents();
        /*if(this.parentsAreRich)
        {*/
            money += 200000;
        //}
        /*if(this.parentsAreNormal)
        {
            money += 100000;
        }
        if(this.parentsArePoor)
        {
            money -= 100000;
        }
        if(this.parentsAreFailures)
        {
            money -= 200000;
            addiction = true;
        }*/
        life = true;
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

   }

}
