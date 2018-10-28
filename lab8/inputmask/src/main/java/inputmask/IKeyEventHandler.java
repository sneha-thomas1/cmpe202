 
/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */
package inputmask ;
public interface IKeyEventHandler
{

    void key(String ch, int cnt) ; 				// send key entry events to screen 
    void backspace(int cnt) ; 				// delete last eneterd key
    void setNext( IKeyEventHandler next) ;		// set next handler in event chain

}