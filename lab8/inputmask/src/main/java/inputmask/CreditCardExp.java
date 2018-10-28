/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */
package inputmask;
public class CreditCardExp implements IDisplayComponent,IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private Decorator wrapper;
    
	
    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	
    
   public void wrapDecorator(Decorator wrapper)
   {
   	this.wrapper=wrapper;
   }

	public String display() {
		if (date.equals(""))
			return "[MM/DD] ";
		else if (wrapper!=null)
		    return "["+wrapper.display(date)+"]  " ;
		else
			return "["+date+"]  " ;
	
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  )
			date += ch ;
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

	public void backspace(int cnt) {
		if (( cnt >= 16 ) && cnt < 20 )
			date=date.substring(0,date.length()-1);
		else if ( nextHandler != null )
			nextHandler.backspace(cnt) ;
	}
	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	

}