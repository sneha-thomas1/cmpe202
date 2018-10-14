
public class MeatDecorator implements ToppingDecorator
{
    private String desc;
    private ToppingDecorator wrapped=null;
    public MeatDecorator(String desc)
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
            return "->"+desc ;
        }
        else 
        {
            return "->"+desc +"\n"+ wrapped.getComponents() ;
        }
    }
    /*public String getDescription(){
    return "";}
    public double getPrice(){
    return 0.00;
    }
    public void setPrice(){
    }*/
}
