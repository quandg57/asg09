
/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 31/07/2014
 * Time: 22:09
 * To change this template use File | Settings | File Templates.
 */
public class MyList implements Item {
   private Node start;
   private Node end;
    private int leng;
    public MyList()
    {
        start=null;
		end=null;
        leng =0;

    }
    public Item clone()
    {
       MyList mylist = new MyList();
	   mylist.appendList(this);
	   return mylist;
    }

    public boolean isEmpty()
    {
        return start==null;
    }
    public void append(Item item)
    {
	
         if (!isEmpty()) {
             end.next = new Node(item,null);
             end = end.next; leng++;
         } else start=end= new Node(item,null);
       
    }
    public void appendList(MyList myList)
    {
	    leng++;
        Node node = myList.start;
        while (node != null)
        {
            append(node.data);
            node = node.next;
        }
		
    }

    public  String toString()
    {
        String str1 = "(" ;
        Node node = this.start;
		boolean b = true ;
        while (node!=null)
        {
            if(b)
            {
                str1 = str1 + node.data.toString();
				b= false;
            }
            else
                str1 =  str1+", "+ node.data.toString();
                node = node.next;
        }
        str1= str1+ ")";
        return str1;
    }
	public int length()
	{
	    return leng;
	}
/*	
	 public Item find(Item item){
	  Node node = this.start;
	  while (node != null){
		 //System.out.println(n1 +  "  ????==????  " + n2);
	  if (node.data.equals(item))
	     return node.data;
	  }
	  return null;
   }
 */  

   private void addInvert(Node start){
	  if (start != null){
	     addInvert(start.next);
		 append(start.data);
	    }
	}
   public void invert(){
      Node first = start;
	  start = end = null;
	  leng =0;
	  addInvert(first);
	 }
	
}


