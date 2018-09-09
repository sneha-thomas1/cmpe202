import java.util.Arrays;
public class GumballMachineType3 extends GumballMachine
{
    public GumballMachineType3(int numberGumballs) {
		
		super(numberGumballs);
		this.cost=50;
		
	}

    
    public void insertCoin(int coin){ 
        
                    if (Arrays.asList(5,10,25).contains(coin))
		      state.insertCoin(coin);
                    else
		      System.out.println("Please insert a dime,nickel or quarter.Machine does not support other coins.");
         
        
    }
}
