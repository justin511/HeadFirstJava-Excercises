import java.io.*;

public class Pond implements Serializable {
// 	private Duck duck  = new Duck();

	// transient skips saving this instance variable 
	// 	and return it as null later
	transient private Duck duck  = new Duck();	
	
	public static void main(String[] args) {
		Pond myPond = new Pond();
		
		try {
			FileOutputStream fo = new FileOutputStream("pond.ser");
			ObjectOutputStream os = new ObjectOutputStream(fo);
		
			os.writeObject(myPond);
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			}
	}
	
	public class Duck {
	}
	
	// 
// 	public class Duck implements Serializable{
// 	}
}