
public class TopBunDecorator  implements ToppingDecorator
{   
    private String desc;
    private ToppingDecorator wrapped=null;
    public TopBunDecorator(String desc)
    {
       
        this.desc=desc;
 
    }
     
    
    public void wrapDecorator( ToppingDecorator w ) 
   {
       this.wrapped = w ;
   }
    
   public String getComponents(){
        if (wrapped == null )
        {
            return desc ;
        }
        else 
        {
            return desc + "\n"+wrapped.getComponents() ;
        }
    }
    /*public String getDescription(){
    return "";}
    public double getPrice(){
    return 0.00;
    }
    public void setPrice(){
    }
    /*@Override
    public String getComponentsPackingSlip(){
        
        return desc+"\n"+super.getComponentsPackingSlip();
    }*/
    
}
