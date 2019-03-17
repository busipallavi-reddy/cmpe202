import java.util.List;

public class Context {
    private DisplayStrategy strategy;
    public void setStrategy(DisplayStrategy strategy){
        this.strategy = strategy;
    }
    public void executeStrategy(){
        strategy.execute();
    }
}
