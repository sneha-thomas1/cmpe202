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
          if (this.has_coin==false)
         {
            if (Arrays.asList(5,10,25).contains(coin))
	    {
              this.total_amount+=coin;
              System.out.println("Coin inserterd.");
              this.has_coin = true ;
              
            }
	    else
              
	     System.out.println("Please insert a nickel,dime or quarter.Machine does not support other coins.");
	 }  
         else 
          System.out.println("Machine already has a coin.You can't insert another coin"); 
      }
      else
        System.out.println("Sorry,the gumball machine is sold out.");       
        
    }

    
}   
    
    

