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
        if (coin==25)
        {
          this.total_amount+=coin;
          System.out.println("Coin inserterd.");
          if ( this.total_amount >= cost )
            this.has_coin = true ;
          else 
            this.has_coin = false ;
        }
        else
          System.out.println( "Please insert a quarter.Machine does not accept other coins." ) ;
      }   
      else
        System.out.println("Sorry,the gumball machine is sold out."); 
    }
}    
   
    

