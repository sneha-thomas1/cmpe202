

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
        
             if (coin==25)
                state.insertCoin(coin);
	     else
		System.out.println("Please insert a quarter.Machine does not support other coins."); 
         
    }
}
