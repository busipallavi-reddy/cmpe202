public class CardNumDisplayDecorator extends NumberDisplayDecorator {

    CardNumDisplayDecorator(IDisplayFormatter iDisplayFormatter) {
        super(iDisplayFormatter);

    }

    @Override
    public String display() {
        String number = iDisplayFormatter.display();
        if ( number.equals("") ) {
            return "[4444 4444 4444 4444]" + "  ";
        } else {
            String[] components = number.split("(?<=\\G.{4})");
            StringBuilder sb = new StringBuilder();
            for (String s: components) {
                sb.append(s);
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            number = sb.toString();
            return "[" + number + "]" + "  ";
        }
    }

    @Override
    public void addKey(String s) {
        iDisplayFormatter.addKey(s);
    }

    @Override
    public void removeLastKey() {
        iDisplayFormatter.removeLastKey();
    }
}
