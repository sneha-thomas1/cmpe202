

public class GumballMachineType1 extends GumballMachine
{
    

    /**
     * Constructor for objects of class GumballMachineType1
     */
    public GumballMachineType1(int numberGumballs) {
		
		super(numberGumballs);
		this.cost=25;
		
	}

    
    public void insertCoin(int coin){ 
        if(this.total_amount==0)
          {
             if (coin==25)
                this.state.insertCoin(coin);
	     else
		System.out.println("Please insert a quarter.Machine does not support other coins."); 
          }
        else
          System.out.println("Machine already has a quarter.You can't insert another coin.");
    }
}
