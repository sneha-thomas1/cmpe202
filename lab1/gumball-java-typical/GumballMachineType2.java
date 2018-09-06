


/**
 * Write a description of class GumballMachine2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachineType2 extends GumballMachine
{
    // instance variables - replace the example below with your own
    
    int balance_required;
    /**
     * Constructor for objects of class GumballMachine2
     */
    public GumballMachineType2(int size )
    {   
        super(size);
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
        public void insertCoin(int coin)
    {  
        if (coin==25)
        {
         total_amount+=coin;
          if ( total_amount >= 50 )
            this.has_coin = true ;
        else 
            this.has_coin = false ;
        }
        else
          System.out.println( "Please insert a quarter.All other coins are not acceptable." ) ;
          
       
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
    	{  balance_required=(50-this.total_amount)/25;
    		System.out.println( "Cost of a Gumball is 50 cents.Please insert " +balance_required+" more quarter to eject a gumball" ) ;
    	}        
    }
}
