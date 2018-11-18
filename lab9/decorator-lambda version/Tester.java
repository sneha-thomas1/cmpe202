 

public class Tester {

    public static void runTest()
    {
        ConcreteComponent obj =  new ConcreteComponent() ;
        Component ConcreteDecoratorA = ()-> "<em>" + obj.operation() + "</em>" ;
        Component ConcreteDecoratorB=()-> "<h1>" + ConcreteDecoratorA.operation() + "</h1>" ;
        String result = ConcreteDecoratorB.operation() ;
        System.out.println( result );
        

        
     }

  public static void main( String [] args )
    {
        Tester t = new Tester() ;
        t.runTest() ;
    }    
    
}
