        abstract class GumballMachine
{
   int num_gumballs,total_amount,cost;
   boolean has_coin;
   

    GumballMachine( int size )
    {   
        this.num_gumballs=size;
        this.has_coin=false;
        this.total_amount = 0;
    }
    abstract void insertCoin(int coin);
    
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
    			this.total_amount-=this.cost;
    			System.out.println( "Thanks for your coin.  Gumball Ejected!" ) ;
                     }
                     else
                       System.out.println( "You have not inserted enough money to buy a gumball" ) ;

                }
    		else
    		{
    			System.out.println( "Sorry,the gumball machine is sold out." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a coin." ) ;
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
    			System.out.println( "You have not inserted any coins." ) ;
    	}
    	
    	       
    }
    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + this.num_gumballs + " gumball");
        if (this.num_gumballs != 1) {
            result.append("s");
        }
        
        result.append("\nCost of a Gumball: "+this.cost+" cents");
        
        result.append("\nTotal Amount in Machine: "+this.total_amount +" cent");
        if (this.total_amount > 1) {
            result.append("s");
        }
        
        return result.toString();
     }
}
