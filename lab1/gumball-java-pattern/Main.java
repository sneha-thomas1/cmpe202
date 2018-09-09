
public class Main {
	public static void main(String[] args) {
	         //type1

	        
		GumballMachine gumballMachine = new GumballMachineType1(5);
		System.out.println(gumballMachine);
		gumballMachine.turnCrank();
		gumballMachine.ejectCoin();
		gumballMachine.insertCoin( 25 );
		System.out.println(gumballMachine);
                gumballMachine.insertCoin( 25 );
                gumballMachine.turnCrank();
                gumballMachine.insertCoin( 50 );
                gumballMachine.insertCoin( 25 );
                gumballMachine.ejectCoin();
                System.out.println(gumballMachine);
                gumballMachine.insertCoin( 25 );
                gumballMachine.turnCrank();
                GumballMachine gumballMachine1 = new GumballMachineType1(1);
                gumballMachine1.insertCoin( 25 );
                gumballMachine1.turnCrank();
                System.out.println(gumballMachine1);
                gumballMachine1.ejectCoin();
                gumballMachine1.turnCrank();
                gumballMachine1.insertCoin( 25 );
                //type2
                GumballMachine gumballMachine2 = new GumballMachineType2(5);
		System.out.println(gumballMachine2);
		gumballMachine2.turnCrank();
		gumballMachine2.ejectCoin();
		gumballMachine2.insertCoin( 25 );
		System.out.println(gumballMachine2);
                gumballMachine2.insertCoin( 25 );
                gumballMachine2.turnCrank();
                gumballMachine2.insertCoin( 50 );
                gumballMachine2.insertCoin( 25 );
                gumballMachine2.ejectCoin();
                System.out.println(gumballMachine2);
                gumballMachine2.insertCoin( 25 );
                gumballMachine2.turnCrank();
                GumballMachine gumballMachine3 = new GumballMachineType2(1);
                gumballMachine3.insertCoin( 25 );
                gumballMachine3.insertCoin( 25 );
                gumballMachine3.insertCoin( 25 );
                gumballMachine3.turnCrank();
                System.out.println(gumballMachine3);
                gumballMachine3.insertCoin( 25 );
                
                gumballMachine3.turnCrank();
                gumballMachine3.insertCoin( 25 );
                gumballMachine3.ejectCoin();
                gumballMachine3.turnCrank();
                System.out.println(gumballMachine3);
                
                //type3
                GumballMachine gumballMachine4 = new GumballMachineType3(5);
		System.out.println(gumballMachine4);
		gumballMachine4.turnCrank();
		gumballMachine4.ejectCoin();
		gumballMachine4.insertCoin( 25 );
		System.out.println(gumballMachine4);
                gumballMachine4.insertCoin( 25 );
                gumballMachine4.turnCrank();
                gumballMachine4.insertCoin( 50 );
                gumballMachine4.insertCoin( 25 );
                gumballMachine4.insertCoin( 5);
                gumballMachine4.insertCoin( 10);
                gumballMachine4.ejectCoin();
                System.out.println(gumballMachine4);
                gumballMachine4.insertCoin( 25 );
                gumballMachine4.turnCrank();
                GumballMachine gumballMachine5 = new GumballMachineType3(1);
                gumballMachine5.insertCoin( 25 );
                gumballMachine5.insertCoin( 25 );
                gumballMachine5.insertCoin( 5 );
                gumballMachine5.turnCrank();
                gumballMachine5.insertCoin( 10);
                gumballMachine5.turnCrank();
                 gumballMachine5.insertCoin( 10);
                 gumballMachine5.turnCrank();
                gumballMachine5.insertCoin( 10);
                System.out.println(gumballMachine5);
                gumballMachine5.turnCrank();
                gumballMachine5.insertCoin( 25 );
                gumballMachine5.ejectCoin();
                gumballMachine5.turnCrank();
                System.out.println(gumballMachine5);
                
               

        

        
	}
}
