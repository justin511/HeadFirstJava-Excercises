import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {

	public void paintComponent(Graphics g) {
		// Orange Rectangle
// 		g.setColor(Color.orange);
// 		g.fillRect(20,50,100,100);


		// Image
// 		Image image = new ImageIcon("Wallpaper_39.jpg").getImage();
// 		g.drawImage(image,0,0,this);
// 		
		
		// Random Oval
		g.fillRect(0,0,this.getWidth(), this.getHeight());	//black rect in center
		
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		
		int ovalWidth = 100;
		int ovalHeight = 100;
		
		int randomXStartPoint = (int) (Math.random() * (this.getWidth()) - ovalWidth);
		int randomYStartPoint = (int) (Math.random() * (this.getHeight()) - ovalHeight);
		
		
		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		// start at 70 pixel from left, 70 from top, 100px wide, 100px tall
		g.fillOval(0, 0, ovalWidth, ovalHeight);	
		
		
		
		// Graphics2D
// 		Graphics2D g2d = (Graphics2D) g;
// 		g.fill3DRect(0,0,100,100,true);
		

	}
	}