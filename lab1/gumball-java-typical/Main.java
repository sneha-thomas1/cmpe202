 



public class Main{

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachineType1(5);

        System.out.println(gumballMachine);

        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 50 );
        System.out.println(gumballMachine);

        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        GumballMachine gumballMachine2 = new GumballMachineType2(5);

        System.out.println(gumballMachine2);

        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin( 50 );

        System.out.println(gumballMachine2);

        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();

        System.out.println(gumballMachine2);
        GumballMachine gumballMachine3 = new GumballMachineType3(5);

        System.out.println(gumballMachine3);

        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank();
        gumballMachine3.insertCoin( 50 );
        gumballMachine3.insertCoin( 5 );

        System.out.println(gumballMachine3);

        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank();
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank();

        System.out.println(gumballMachine3);
    }
}
