package basic3;

public class ValueExchange {
	public static void main(String args[]) {
	int a=3;
	int b=4;
	int tmp;
	
	tmp = a;
	a = b;
	b= tmp;
	System.out.println(a);
	System.out.println(b);
	}
}
