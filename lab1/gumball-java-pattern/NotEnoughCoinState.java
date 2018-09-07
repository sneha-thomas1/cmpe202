
/**
 * Write a description of class NotEnoughCoinState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NotEnoughCoinState implements State
{
    GumballMachine gumballMachine;
 
    public NotEnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    
    }
 
	public void insertCoin(int coin) {
		System.out.println("You inserted a coin");
		gumballMachine.setTotalAmount(gumballMachine.getTotalAmount()+coin);
		if (gumballMachine.getCost()<=gumballMachine.getTotalAmount())
		  gumballMachine.setState(gumballMachine.getHasCoinState());
		else
		  gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
	}
 
	public void ejectCoin() {
		System.out.println("Coins returned");
		gumballMachine.setState(gumballMachine.getNoCoinState());
		gumballMachine.setTotalAmount(0);
		
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's not enough coin to buy a gumball");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coin";
	}
}
