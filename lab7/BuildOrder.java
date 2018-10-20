  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        
        //First Burger
        CustomBurger customBurger1 = new CustomBurger( "\nBuild Your Own Burger" ) ;
        // base price for 1/2 lb
        Burger b1 = new Burger( "Burger Options" ) ;
        String[] bo1 = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b1.setOptions( bo1 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co1 = {  "Yellow American","Spicy Jalapeno Jack"} ;
        c1.setOptions( co1 ) ;
        c1.wrapDecorator( b1 ) ;
        //premium cheese +1.50
        PremiumCheese pc1 = new PremiumCheese( "Cheese Options" ) ;
        String[] pco1 = { "Danish Blue Cheese" } ;
        pc1.setOptions( pco1 ) ;
        pc1.wrapDecorator( c1 ) ;
        // 1 sauce free, extra +.50
        Sauce s1 = new Sauce( "Sauce Options" ) ;
        String[] so1 = { "Thai Peanut Sauce","Mayonnaise" } ;
        s1.setOptions( so1 ) ;
        s1.wrapDecorator( pc1 ) ;
        //  toppings free
        Toppings t1 = new Toppings( "Toppings Options" ) ;
        String[] to1 = { "Dill Pickle Chips","Black Olives","Spicy Pickles" } ;
        t1.setOptions( to1 ) ;
        t1.wrapDecorator( s1 ) ;
        // premium topping +1.50
        Premium p1 = new Premium( "Premium Options" ) ;
        String[] po1 = { "Marinated Tomatoes" } ;
        p1.setOptions( po1 ) ;
        p1.wrapDecorator( t1 ) ;
        
        // Bun
        Bun bu1= new Bun( "Bun Options" ) ;
        String[] buo1 = { "Ciabatta(Vegan)" } ;
        bu1.setOptions( buo1 ) ;
        bu1.wrapDecorator( p1) ;
        
        // 1 side free,3.00 per extra Side 
       Side si1= new Side( "Side Options" ) ;
        String[] sio1 = { "Shoestring Fries" } ;
        si1.setOptions( sio1 ) ;
        si1.wrapDecorator( bu1) ;
        
        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( si1 ) ;
        customBurger1.addChild( b1 ) ;
        customBurger1.addChild( c1 ) ;
        customBurger1.addChild( pc1 ) ;
        customBurger1.addChild( s1 ) ;
        customBurger1.addChild( t1 ) ;
        customBurger1.addChild( p1 ) ;
        customBurger1.addChild( bu1 ) ;
        customBurger1.addChild( si1 ) ;
        
        //Second Burger
        CustomBurger customBurger = new CustomBurger( "\nBuild Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = {  "Smoked Gouda","Greek Feta"} ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        //premium cheese +1.50
        PremiumCheese pc = new PremiumCheese( "Cheese Options" ) ;
        String[] pco = { "Fresh Mozzarella" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        // 1 sauce free, extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Habanero Salsa" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        //  toppings free
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Crushed Peanuts" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Sunny Side Up Egg*","Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        // Bun
        Bun bu= new Bun( "Bun Options" ) ;
        String[] buo = { "Gluten-Free Bun" } ;
        bu.setOptions( buo ) ;
        bu.wrapDecorator( p) ;
        
        // 3.00 per  Side 
       Side si= new Side( "Side Options" ) ;
        String[] sio = { "Shoestring Fries" } ;
        si.setOptions( sio ) ;
        si.wrapDecorator( bu) ;
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( si ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bu ) ;
        customBurger.addChild( si ) ;
        
        // Add Custom Burgers to the ORder
        order.addChild( customBurger1 );
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/