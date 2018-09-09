public class GumballMachineType2 extends GumballMachine
{
    
    public GumballMachineType2(int size )
    {   
        super(size);
        this.cost=50;
           
    }

    
    public void insertCoin(int coin)
    { if(this.num_gumballs>0)
      {
        if (this.has_coin==false)
         {
          if (coin==25)
          {  
            this.total_amount+=coin;
            System.out.println("Coin inserterd.");
            
            this.has_coin = true ;
            
          }
          else
          System.out.println( "Please insert a quarter.Machine does not accept other coins." ) ;
        }  
        else 
          System.out.println("Machine already has a quarter.You can't insert another quarter"); 
      }
      else
        System.out.println("Sorry,the gumball machine is sold out."); 
    }
    
    
    
   
}    
   
    

