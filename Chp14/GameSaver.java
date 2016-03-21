import java.io.*;

public class GameSaver {
	public static void main (String[] args) {
		GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword"});
		GameCharacter two = new GameCharacter(50, "Human", new String[] {"bow", "sword"});
		GameCharacter three = new GameCharacter(50, "Orc", new String[] {"bow", "sword"});
		
		try {
			FileOutputStream fo  = new FileOutputStream("game.ser");
			ObjectOutputStream os = new ObjectOutputStream(fo);
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		one = null;
		two = null;
		three = null;
		
		try {
			FileInputStream fis = new FileInputStream("game.ser");
			ObjectInputStream is = new ObjectInputStream(fis);
			GameCharacter oneRestore =  (GameCharacter) is.readObject();
			GameCharacter twoRestore = (GameCharacter) is.readObject();
			GameCharacter threeRestore = (GameCharacter) is.readObject();
			
			System.out.println("One's type:" + oneRestore.getType());
			System.out.println("two's type:" + twoRestore.getType());
			System.out.println("three's type:" + threeRestore.getType());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}