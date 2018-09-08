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
    
    abstract void ejectCoin();
    
    abstract void turnCrank();
    
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
