
/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 31/07/2014
 * Time: 22:09
 * To change this template use File | Settings | File Templates.
 */
public class Node  {
    Item data;
    Node next;

    public Node(Item data)
    {
        this.data = data.clone();
    }
    public Node(Item data,Node next)
    {
       this.data= data.clone();
       this.next= next;
    }
}

