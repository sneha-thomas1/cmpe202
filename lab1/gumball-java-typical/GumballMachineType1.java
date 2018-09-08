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
   
   public void turnCrank()
    {
    	
    	if (this.has_coin )
    	{
    		this.has_coin=false;
    		if ( this.num_gumballs > 0  )
    		{
    			this.num_gumballs-- ;
    			this.total_amount=0;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "Sorry,the gumball machine is sold out." ) ;
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
