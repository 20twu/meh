public class life extends prelife{
    boolean addiction = false;
    boolean living = false;
    
    int wealth = 0;
    int intel = 0;
    
    public void getBirthed()
    {   living = true;
        if(this.parentIsRich())
        {wealth+=200000;
         intel+=10;
        }
        if(this.parentsAreFailures())
        {wealth-= 200000;
         addiction = true;
         intel-=10;
        }
        while(wealth>0)
        {this.privateSchool();
         intel+=2;
         wealth-=1000;
        }
        /*if(this.parentsAreRich)
        {
            wealthey += 200000;
        //}
        /*if(this.parentsAreNormal)
        {
            wealthey += 100000;
        }
        if(this.parentsArePoor)
        {
            wealthey -= 100000;
        }
        if(this.parentsAreFailures)
        {
            wealthey -= 200000;
            addiction = true;
        }*/
        }
    
    public void goToSchool()
    {
        for(int year = 0; year<12; year++)
        {
            if(wealth>0)
            {this.privateSchool();
            }
            else{
                if(wealth>-100001)
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
