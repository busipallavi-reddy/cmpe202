public class MainScenary {
    public static void main(String args[]) {

        IStrategy river = () -> {
            System.out.println("\n----River Scenary!!! It's flowing !!!-----");
        };
        
        IStrategy sky = () -> {
            System.out.println("\n----Sky Scenary!!! It's cloudy !!!-----");
        };

        IStrategy land = () -> {
            System.out.println("\n----Land Scenary!!! It's all green !!!-----");
        };

        river.scenary();
        sky.scenary();
        land.scenary();
    }
}
