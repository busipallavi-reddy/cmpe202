public class Sides extends LeafDecorator
{
    private String[] options ;
    
    
    public Sides( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length >= 1 )
            this.price += (options.length) * 3.00 ;
    }

    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}