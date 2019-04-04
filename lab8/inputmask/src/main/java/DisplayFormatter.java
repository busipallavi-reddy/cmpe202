public class DisplayFormatter implements IDisplayFormatter {

    private String val = "";

    @Override
    public String display() {
        return val;
    }

    @Override
    public void addKey(String s) {
        val += s;
    }

    @Override
    public void removeLastKey() {
        val = val.substring(0, val.length() - 1);
    }
}
