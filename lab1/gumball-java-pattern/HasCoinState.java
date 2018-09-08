
import java.util.Random;

public class HasCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int coin) {
		
		System.out.println("You can't insert another coin");
       }
		
 
	public void ejectCoin() {
		System.out.println("Coin returned");
		gumballMachine.setState(gumballMachine.getNoCoinState());
		gumballMachine.setTotalAmount(0);
	}
 
	public void turnCrank() {
	
	if(gumballMachine.getTotalAmount()<gumballMachine.getCost())
	{
	  System.out.println("You turned...but you have not paid enough money for the gumball");
	  gumballMachine.setState(gumballMachine.getNoCoinState());	
	}
	else
        {
	  System.out.println("You turned...");
	  gumballMachine.setState(gumballMachine.getSoldState());
	}
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
