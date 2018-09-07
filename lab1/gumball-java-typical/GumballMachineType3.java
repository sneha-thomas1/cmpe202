import java.util.Arrays;

public class GumballMachineType3 extends GumballMachine
{
    public GumballMachineType3(int size )
    {   
        super(size);
        this.cost=50;
    }
    
    public void insertCoin(int coin)
    { if(this.num_gumballs>0)
      { 
       if (Arrays.asList(5,10,25).contains(coin))
	{
          this.total_amount+=coin;
          System.out.println("Coin inserterd.");
          if ( this.total_amount >= 50 )
            this.has_coin = true ;
          else 
            this.has_coin = false ;
        }
	else
          System.out.println("Please insert a nickel,dime or quarter.Machine does not support other coins.");
      }
      else
        System.out.println("Sorry,the gumball machine is sold out.");       
        
    }
}   
    
    

