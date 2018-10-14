





import java.text.DecimalFormat;
public class Burger extends Composite 
{
    
    ToppingDecorator decorator=null;
    
    
   
    public Burger(String d)
    {
       super(d);
       setPrice();
    }
    public void setDecorator( ToppingDecorator p )
    {
        this.decorator = p ;
    }
    @Override
    public void setPrice()
    { 
     
            if(desc=="HB") {this.price += 6.39 ;this.type="Ham";}
            if(desc=="CB"){this.price += 7.19 ;this.type="Cheese";}
            if(desc=="BB"){this.price += 7.19 ;this.type="Bacon";}
            if(desc=="BCB"){this.price += 7.79 ;this.type="BaconCheese";}
            if(desc=="LHB"){this.price += 4.59 ;this.type="Ham";}
            if(desc== "LCB"){this.price += 5.29 ;this.type="Cheese";}
            if(desc== "LBB"){this.price += 5.59 ;this.type="Bacon";}
            if(desc== "LBCB"){this.price += 6.19 ;this.type="BaconCheese";}
        
    }
    @Override
    public  String getComponents(){
    //return "{{{{"+this.type+"}}}}";
    return "{{{{"+this.type+"}}}}"+"\n"+decorator.getComponents();
    }
    @Override
    public  String getComponentsPackingSlip(){
    //return "{{{{"+this.type+"}}}}";
    return decorator.getComponents()+"\n"+"{{{{"+this.type+"}}}}";
    }
   
 }
