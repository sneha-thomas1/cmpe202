


/**
 * Write a description of class GumballMachine1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachineType1 extends GumballMachine
{   
    public GumballMachineType1( int size)
    {   
        super(size);
        this.total_amount=0;
        
    }
    public void insertCoin(int coin)
    {
        if (total_amount==0)
         {
             if (coin==25) 
                {
                 this.has_coin = true ;
                 total_amount=25;
                }
              else
                {
                    System.out.println("Please insert a quarter.Machine does not accept other coins");
                    this.has_coin=false;
                }
               
          }
        else 
             System.out.println("You can't insert another quarter");
        
          
    }
    
    public void turnCrank()
    {
    	if ( this.has_coin )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_coin = false ;total_amount=0;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
}
