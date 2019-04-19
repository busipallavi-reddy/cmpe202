package observer;

public class ObserverTest
{
    public void runTest()
    {
        observer.TheEconomy s = new observer.TheEconomy();
        //observer.Pessimist p = new observer.Pessimist(s);
           Observer p = () -> {

                if ( s.getState().equalsIgnoreCase("The Price of gas is at $5.00/gal") )
                {
                    System.out.println("This is the beginning of the end of the world!");
                }
                else if ( s.getState().equalsIgnoreCase( "The New iPad is out today" ) )
                {

                    System.out.println("Not another iPad!")  ;
                }
                else
                {
                    System.out.println(":(" );
                }
            };
            //observer.Optimist o = new observer.Optimist(s);

           Observer o = () -> {
               if ( s.getState().equalsIgnoreCase("The Price of gas is at $5.00/gal")      )
               {
                   System.out.println("Great! It's time to go green." );
               }
               else if ( s.getState().equalsIgnoreCase( "The New iPad is out today" ) )
               {
                   System.out.println("Apple, take my money!") ;
               }
               else
               {
                   System.out.println(":)" );
               }

           };
           s.attach(p);
           s.attach(o);
           s.setState("The New iPad is out today");
           //p.showState();
           //o.showState();
           s.setState("Hey, Its Friday!");
           //p.showState();
           //o.showState();
    }
    
    public static void main( String [] args )
    {
        ObserverTest t = new ObserverTest() ;
        t.runTest() ;
    }     
    
}

