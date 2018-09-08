
public class GumballMachineType2 extends GumballMachine
{
    public GumballMachineType2(int numberGumballs) {
		
		super(numberGumballs);
		this.cost=50;
		
	}

    
    public void insertCoin(int coin){ 
       
           if (coin==25)
                    state.insertCoin(coin);
           else
	            System.out.println("Please insert a quarter.Machine does not support other coins."); 
	
    }
}
