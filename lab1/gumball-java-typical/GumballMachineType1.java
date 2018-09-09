public class GumballMachineType1 extends GumballMachine
{   
    public GumballMachineType1( int size)
    {   
        super(size);
        this.cost=25;
        
    }
    public void insertCoin(int coin)
    {   if(this.num_gumballs>0)
        {
         if (this.has_coin==false)
         {
             if (coin==25) 
                {
                 this.has_coin = true ;
                 this.total_amount=25;
                 System.out.println("Coin inserterd.");
                }
              else
                {
                    System.out.println("Please insert a quarter.Machine does not accept other coins");
                    this.has_coin=false;
                }
               
         }
         else 
             System.out.println("Machine already has a quarter.You can't insert another quarter");
        }
        
        else
           System.out.println("Sorry,the gumball machine is sold out.");
        
   }
   
   
    
   
}
