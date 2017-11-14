public class life extends prelife{
    public life(){
        super ();
    }
    boolean addiction = false;
    boolean living = false;
    
    int wealth = 0;
    int intel = 0;
    
    public void getBirthed()
<<<<<<< HEAD
    {   this.parents();
        if(parent == 5)
        {
            money += 200000;
        }
        if(parent == 4)
=======
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
>>>>>>> 9871b836095e71ea673c7dc0c8e87429d4ced54e
        {
            wealthey += 100000;
        }
        if(parent == 2)
        {
            wealthey -= 100000;
        }
        if(parent == 1)
        {
            wealthey -= 200000;
            addiction = true;
<<<<<<< HEAD
        }
        life = true;
=======
        }*/
>>>>>>> 9871b836095e71ea673c7dc0c8e87429d4ced54e
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
