/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IDisplayFormatter date = new CardExpDisplayDecorator(new DisplayFormatter());

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		return date.display();
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  )
			date.addKey(ch);
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

	@Override
	public void removeKey(int cnt) {
		if (cnt >= 16 && cnt <= 19) {
			date.removeLastKey();
		} else if ( nextHandler != null ) {
			nextHandler.removeKey(cnt);
		}
	}
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}