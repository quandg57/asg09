
/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 31/07/2014
 * Time: 22:10
 * To change this template use File | Settings | File Templates.
 */
public class NumeralItem implements Item {
    private int value;
    public NumeralItem(int value)
    {
        this.value = value;
    }
    public Item clone()
    {
        Item numeralItem ;
        numeralItem = new NumeralItem(value);
        return numeralItem;
    }
    public String toString()
    {
        return ""+value;
    }

}
