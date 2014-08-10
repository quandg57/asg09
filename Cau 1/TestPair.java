// TestPair
public class TestPair{
    public static void main(String [] args){
	    Pair<String> mm= new Pair<String> ("1st","2nd");
		System.out.println(mm.getFirst()+","+mm.getSecond());
		Pair<Integer> i = new Pair<Integer>(3,3);
		System.out.println(i.getFirst()+ "," + i.getSecond());
		System.out.println(i.toString());
		System.out.println(mm.toString());
	}
}