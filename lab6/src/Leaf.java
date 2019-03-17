
public class Leaf implements Component {

    protected String description ;

    public Leaf ( String d )
    {
        description = d ;
    }

    public void printDescription(String ReceiptType) {
        System.out.println( " " + description + " ") ;
    }


    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }

}
