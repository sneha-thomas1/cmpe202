/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */
package inputmask;
/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private IDisplayComponent cvc;
    private int count;
    private Decorator oneSpace,slash;
    public App() {

        
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();
        oneSpace=new OneSpaceDecorator();
        slash=new SlashDecorator();
        num.wrapDecorator(oneSpace);
        exp.wrapDecorator(slash);
        screen = new Screen();
        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if(ch.equalsIgnoreCase("X")||ch.equalsIgnoreCase("delete")){
            count--;
            screen.backspace(count);
        }
        else if (ch.equals("")){
         //nothing
        }
        else {
            if (count<23)
           { count++;
             screen.key(ch, count);
           }
        }
    }

}

