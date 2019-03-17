public class PackingStrategy extends DisplayStrategy
{

    @Override
    public void print() {
        topBunToppings();
        onMeat();
        Meat();
        fries();
    }
}
