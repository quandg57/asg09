import java.util.Stack;
public class TestMyList{
	public static void main(String[] args)
		{
			MyList l = new MyList();
			l.append(new NumeralItem(1));
			l.append(new NumeralItem(2));
			System.out.println(l);  // (1, 2)
			MyList l2 = new MyList();
			l2.append(new StringItem("a"));
			l2.append(new StringItem("b"));
			System.out.println(l2); // (a, b)
			l.append(l2);
			System.out.println(l); // (1, 2, (a, b))
            l.appendList(l2);
			System.out.println(l); // (1, 2, (a, b), a, b)
			l2.append(new NumeralItem(5));
			System.out.println(l2); // (a, b, 5)
			System.out.println(l); // (1, 2, (3, 4), 3, 4)
			System.out.println(" Length is :" + l.length());// 5
			l.invert();
			System.out.println(l);
		}
}