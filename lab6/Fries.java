 

import java.text.DecimalFormat;


public class Fries implements MenuItem {

    private String desc="" ;
    double price=0.00 ;

    public Fries ( String d ) 
    {
        desc = d ;
        setPrice();
    }
    
    public void setPrice(){
        if(desc=="LTL CAJ"){this.price += 2.79 ;}
        if(desc=="REG CAJ"){this.price += 3.39 ;}
        if(desc=="LRG CAJ"){this.price += 5.59 ;}
    }
    public String getDescription() {
       
            return desc;
    }
    
    public double getPrice(){
        return price;
    }
    
}
 
