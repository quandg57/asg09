// viet class ArrayAlg
import java.lang.*;
import java.util.*;
public class ArrayAlg{
    public static int count =0;
    public static <T> String printArray(T[] a)
	{
	    String str = new String();
	    for(int i=0; i<a.length ;i++)
		{
		     str= str + String.valueOf(a[i]) + " ";
	    }
		return str;
	}
	
	public static <T> String printArray(T[] a, int start, int end) throws Exception
	{
	     if(start<0||start>=end||(end<0&&end>(a.length-1))) throw new Exception();
		 	 
		 String str = new String();
	    for(int i=start; i<end ;i++)
		{
		     str= str + String.valueOf(a[i]) + " ";
			 count++;
		}
		return str;
	}
	
	public int getCounter()
	{
	    return count;
	}
	public static <T extends Comparable> Pair<T> makeTWO(T[] a) 
    {
	    int l = a.length;
		int x,j;
		if(a==null|| l==0) return null;
		T max1 = a[0];
		T max2 = a[0];
		
         for( x=0; x<l-1 ; x++)         
            for( j=x+1 ; x< l ; j++)
                if(a[x].compareTo(a[j]) >0) 
                { 
                    T temp = a[x];
                    a[x] = a[j];
                    a[j] = temp;
                }	        
        max1 = a[l-1];
	    max2 = a[l-2];
		
		return new Pair<T>(max1, max2);
    }		
	public static void main(String[] args){
	    
		try{
			Integer[] num = { 9, 5 , 8};
			
			Pair<Integer> p = ArrayAlg.<Integer>makeTWO(num);
			
            System.out.println("MAX1 is " + p.getFirst() + " ;" + " MAX2 is " + p.getSecond());		
			System.out.println(ArrayAlg.<Integer>printArray(num));
			
			String[] str1 = { "Body", "LAdy", "Gandi"};
			System.out.println(ArrayAlg.<String>printArray(str1));
			
			
			System.out.println(ArrayAlg.<Integer>printArray(num, 0, 2));
			
			
			/* Pair<Integer> p = ArrayAlg.<Integer>makeTWO(num);
			
            System.out.println("MAX1 is " + p.getFirst() + " ;" + " MAX2 is " + p.getSecond());		 */	
			}
			
	    catch(Exception e)
            {
              e.printStackTrace();
            }		
	}
}