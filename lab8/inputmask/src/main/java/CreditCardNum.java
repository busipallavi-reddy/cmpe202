/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IDisplayFormatter number = new CardNumDisplayDecorator(new DisplayFormatter()) ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
    	return number.display();
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 )
			number.addKey(ch);
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

	@Override
	public void removeKey(int cnt) {
		if (cnt <= 15) {
			number.removeLastKey();
		} else if ( nextHandler != null ) {
			nextHandler.removeKey(cnt);
		}
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}