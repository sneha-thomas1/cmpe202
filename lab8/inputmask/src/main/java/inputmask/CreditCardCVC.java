/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */
package inputmask;
public class CreditCardCVC implements IDisplayComponent,IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String cvc = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( cvc.equals("") )
			return "[123]" + "  " ;
		else
			return "[" + cvc + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 21 ) {
			if ( cnt >= 21 && cnt <= 23 )
				cvc += ch ;
			else if ( nextHandler != null )
				nextHandler.key(ch, cnt) ;
		}
		
	}	
	public void backspace(int cnt) {
		if ( cnt >= 20 )
			cvc=cvc.substring(0,cvc.length()-1);
		else if ( nextHandler != null )
			nextHandler.backspace(cnt) ;
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	public void setDetails(String num){
    	this.cvc=num;

    	System.err.println("insideCardcvc:" + cvc);
    }

}