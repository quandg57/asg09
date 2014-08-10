// viet class Pair

public class Pair<T>{
    private T first;
	private T second;
	
    public Pair() { first =null; second = null ;}
	public Pair(T first,T second)
    {
        this.first = first;
        this.second= second;
    }
	
    public T getFirst() { return first; }
    public T getSecond(){ return second;}

    public void setFirst(T exvalue) { first = exvalue; }
    public void setSecond(T exvalue){ second= exvalue; }
	
	public String toString()
	{
	    return String.valueOf(first) + "," + String.valueOf(second);
	}
}	