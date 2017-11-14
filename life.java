public class life extends prelife{
    public life(){
        super ();
    }
    boolean addiction = false;
    boolean life = false;
    public void getBirthed()
    {   this.parents();
        if(parent == 5)
        {
            money += 200000;
        }
        if(parent == 4)
        {
            money += 100000;
        }
        if(parent == 2)
        {
            money -= 100000;
        }
        if(parent == 1)
        {
            money -= 200000;
            addiction = true;
        }
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
