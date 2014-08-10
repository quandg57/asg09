
/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 31/07/2014
 * Time: 22:10
 * To change this template use File | Settings | File Templates.
 */
public class StringItem implements Item {
    private String value;
    public Item clone()
    {
        Item stringItem ;
        stringItem = new StringItem(value);
        return stringItem;
    }
    public String toString()
    {
        return ""+value;
    }
    public StringItem(String value)
    {
        this.value=value;
    }
}
