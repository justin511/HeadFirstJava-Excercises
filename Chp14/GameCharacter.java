import java.io.*;

public class GameCharacter implements Serializable {
	int health;
	String type;
	String[] weapons;
	
	public GameCharacter(int h, String t,String[] w) {
		health = h;
		type = t;
		weapons = w;
	}
	
	public String getType() {
		return type;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getWeapons() {
		String weaponList = "";
		for (int i=0; i<weapons.length; i++) {
			weaponList += weapons[i] + ",";
		}
		return weaponList;
	}
}