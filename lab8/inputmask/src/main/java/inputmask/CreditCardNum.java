/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */
package inputmask;
public class CreditCardNum implements IDisplayComponent,IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	
	private Decorator wrapper;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

    public void wrapDecorator(Decorator wrapper)
   {
   	this.wrapper=wrapper;
   }
    
	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]  " ;
		else if (wrapper!=null)
		    return "["+wrapper.display(number)+"]  " ;
		else
			return "["+number+"]  " ;

	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 )
			number += ch ;
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

	public void backspace(int cnt) {
		if (( cnt < 16 ) && number.length()>0)
			number=number.substring(0,number.length()-1);
		else if ( nextHandler != null )
			nextHandler.backspace(cnt) ;
	}
	
   
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}