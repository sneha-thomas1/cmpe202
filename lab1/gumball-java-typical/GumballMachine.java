


abstract class GumballMachine
{
   int num_gumballs,total_amount;
   boolean has_coin;
   

    GumballMachine( int size )
    {   
        this.num_gumballs=size;
        this.has_coin=false;
        this.total_amount=0;
        
    }
    abstract void insertCoin(int coin);
    
    abstract void turnCrank();
    
}
