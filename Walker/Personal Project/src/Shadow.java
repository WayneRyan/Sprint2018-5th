import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Shadow {
	
	BufferedImage myScreen;
	
	public Shadow(BufferedImage screen){
		myScreen = screen;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.black);
		for(int x=0 ; x<myScreen.getWidth() ; x++){
			int firstGreen=0;
			boolean isShadow = false;
			for(int y=0 ; y<myScreen.getHeight() ; y++){
				Color c = new Color(myScreen.getRGB(x, y));
				if(c.equals(Ground.myColor)&& firstGreen==0)firstGreen = y;
				if(c.equals(Color.black) ||
				   c.equals(new Color(0x733E3E)) ||
				   c.equals(new Color(0x858585))){
					isShadow = true;
				   }
			}
			if(isShadow){
				g.fillRect(x, firstGreen, 1, 15);
			}
		}
	}

}
