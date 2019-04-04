public class CardExpDisplayDecorator extends NumberDisplayDecorator {

    CardExpDisplayDecorator(IDisplayFormatter iDisplayFormatter) {
        super(iDisplayFormatter);

    }

    @Override
    public String display() {
        String date = iDisplayFormatter.display();

        if ( date.equals("") ) {
            return "[MM/YY]" + "  ";
        } else {
            String[] components = date.split("(?<=\\G.{2})");
            StringBuilder sb = new StringBuilder();
            for (String s: components) {
                sb.append(s);
                sb.append("/");
            }
            sb.deleteCharAt(sb.length() - 1);
            date = sb.toString();
            return "[" + date + "]" + "  ";
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
