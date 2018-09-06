


/**
 * Write a description of class GumballMachine3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachineType3 extends GumballMachine
{
    // instance variables - replace the example below with your own
   public int balance_required=0;

    /**
     * Constructor for objects of class GumballMachine3
     */
    public GumballMachineType3(int size )
    {   
        super(size);
        
    }
     public void insertCoin(int coin)
    {  
        total_amount+=coin;
          
        if ( total_amount >= 50 )
            this.has_coin = true ;
        else 
            this.has_coin = false ;
    }
    
    public void turnCrank()
    {   
    	if ( this.has_coin )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.total_amount-=50;
    			if(total_amount>=50)
    			  this.has_coin = true ;
    			else
    			  this.has_coin = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{       balance_required=50-this.total_amount;
    		System.out.println( "Cost of a Gumball is 50 cents.Please insert atleast "+balance_required+ " cents to eject a gumball " ) ;
    	}        
    }
}
