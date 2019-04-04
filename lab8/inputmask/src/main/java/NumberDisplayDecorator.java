public abstract class NumberDisplayDecorator implements IDisplayFormatter {

    protected IDisplayFormatter iDisplayFormatter;

    NumberDisplayDecorator(IDisplayFormatter iDisplayFormatter) {
        this.iDisplayFormatter = iDisplayFormatter;
    }

    @Override
    public String display() {
        return iDisplayFormatter.display();
    }
}
