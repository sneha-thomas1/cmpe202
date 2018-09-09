
abstract class GumballMachine {

	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
 
	State state = soldOutState;
	int count,total_amount,cost;
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);
		this.total_amount=0;
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			this.state = noCoinState;
		} 
		
	}
        abstract void insertCoin(int coin); 

        
	public void ejectCoin() {
		this.state.ejectCoin();
	}
 
	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (this.count != 0) {
			this.count = this.count - 1;
		}
	}
 
	int getCount() {
		return this.count;
	}
 
	void refill(int count) {
		this.count = count;
		this.state = noCoinState;
	}

        public State getState() {
        return this.state;
        }

        public State getSoldOutState() {
        return soldOutState;
        }

        public State getNoCoinState() {
        return noCoinState;
        }

        public State getHasCoinState() {
        return hasCoinState;
        }
   
        public State getSoldState() {
        return soldState;
        }

        public int getCost() {
        return this.cost;
        }
    
        public int getTotalAmount() {
        return this.total_amount;
        }
    
    
        public void setTotalAmount(int totalamount) {
        
        this.total_amount=totalamount;
        
        }
        
        public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + this.count + " gumball");
		if (this.count != 1) {
			result.append("s");
		}
		
		result.append("\nCost of a Gumball: "+this.cost+" cents");
		
		result.append("\nTotal Amount in Machine: "+this.total_amount +" cent");
		if (this.total_amount > 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + this.state + "\n");
		return result.toString();
	 }
}
