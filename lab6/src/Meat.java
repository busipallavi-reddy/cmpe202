public class Meat extends Leaf
{
    public Meat(String description)
    {
        super(description);
    }

    public void printDescription(String ReceiptType){
        System.out.println(" {{{{ " + description + " }}}} ");
    }
}
