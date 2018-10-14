import java.text.DecimalFormat; 
import java.util.ArrayList;
public class BuildOrder {
    private ArrayList<MenuItem> order=new ArrayList<MenuItem>();
    private ArrayList<MenuItem> orderpackingslip=new ArrayList<MenuItem>();
    private PrintingStrategy currentStrategy;
    private PrintingStrategy ReceiptStrategy;
    private PrintingStrategy PackingSlipStrategy;
    public BuildOrder(){
        Composite top, bottom, meat;
         Burger b=new Burger("LBB");
               TopBunDecorator l=new TopBunDecorator("LETTUCE");
               TopBunDecorator t=new TopBunDecorator("TOMATO");
               MeatDecorator o=new MeatDecorator("G Onion");
               MeatDecorator j=new MeatDecorator("JALA Grilled");
               Fries f=new Fries("LTL CAJ");
        ReceiptStrategy=new PrintingStrategy(){
           
            public void printDescription()
            { 
               b.setDecorator(l);
               l.wrapDecorator(t);
               t.wrapDecorator(o);
               o.wrapDecorator(j);
               order.add(b);
               order.add(f);Double total=0.00;
               DecimalFormat fmt = new DecimalFormat("0.00");
               for(MenuItem item:order)
              {
                 System.out.println(item.getDescription()+"             "+fmt.format(item.getPrice()));
                 if (item instanceof Composite)
                  System.out.println(((Composite)item).getComponents());
                 total+=item.getPrice();
               }
             System.out.println("Sub. Total :         "+fmt.format(total));
            }
        };
        
        PackingSlipStrategy=new PrintingStrategy(){
           
            public void printDescription()
            { b.setDecorator(l);
               l.wrapDecorator(t);
               t.wrapDecorator(o);
               o.wrapDecorator(j);
               orderpackingslip.add(b);
               orderpackingslip.add(f);
             for (MenuItem item:orderpackingslip)
             { System.out.println(item.getDescription());
                
                if (item instanceof Composite)
                  System.out.println(((Composite)item).getComponentsPackingSlip());
             }
            }
           
        };
        currentStrategy=ReceiptStrategy;
    }
    
    public void printDescription(){
        currentStrategy.printDescription();
    }
    
    public void PackingSlipStrategy(){
        currentStrategy=PackingSlipStrategy;
    }
    public void ReceiptStrategy(){
        currentStrategy=ReceiptStrategy;
    }
}
        
       
