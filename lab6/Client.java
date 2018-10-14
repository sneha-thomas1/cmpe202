  

public class Client {

    public static void main()
    {
        BuildOrder bo=new BuildOrder();
        System.out.println("Receipt");
        bo.printDescription();
        bo.PackingSlipStrategy();
        System.out.println("\n\nPacking Slip");
        bo.printDescription();
        

    }
}
 
