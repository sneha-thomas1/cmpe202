import java.text.DecimalFormat;
public  class Composite implements MenuItem
{
 
    protected String desc,type;
    protected double price;
   
    public Composite(String d)
    {
       desc=d;
    }

    
    public  void setPrice(){}
    
    public  String getComponents(){
    return "";
    }
    public  String getComponentsPackingSlip(){
    return "";
    }
  
    public double getPrice(){
        return this.price;
    }
    
    
    public String getDescription() {
       
            return this.desc;
    }
    
    }
    


