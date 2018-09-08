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
    public void turnCrank()
    {
    	if (this.has_coin )
    	{
    		this.has_coin=false;
    		if ( this.num_gumballs > 0  )
    		{ 
    		    if(this.total_amount>=this.cost)
    		     {
    			this.num_gumballs-- ;
    			this.total_amount-= this.cost;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                     }
                     else
                       System.out.println( "Cost of a gumball is 50 cents.You dont have enough quarter to buy a gumball" ) ;

                }
    		else
    		{
    			System.out.println( "Sorry,the gumball machine is sold out.Can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter." ) ;
    	}    
    }
    
    public void ejectCoin()
    {
    	if ( this.has_coin)
    	{
    		
    			this.has_coin = false ;
    			this.total_amount=0;
    			System.out.println( "Coins returned." ) ;
    	}
    	else
    	{
    			System.out.println( "You have not inserted a quarter." ) ;
    	}
    	
    	       
    }
}   
    
    

