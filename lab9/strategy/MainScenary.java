public class MainScenary {
    public static void main(String args[]) {

        IStrategy river = new RiverStrategy();
        river.scenary();

        IStrategy sky = new SkyStrategy();
        sky.scenary();

        IStrategy land = new LandStrategy();
        land.scenary();
    }
}
