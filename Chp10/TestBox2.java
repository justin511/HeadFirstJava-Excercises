
// error: non-static method go() cannot be referenced from a static context

// Doesn't even compile

public class TestBox {
	Integer i;
	int j;
	
	public static void main(String[] args) {
		TestBox t = new TestBox();
		go();		
	}
	
	public void go() {
		j=i;
		System.out.println(j);
		System.out.println(i);
	}
}