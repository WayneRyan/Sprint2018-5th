import java.awt.Color;
import java.awt.Graphics;

public class Ground {

	private double x;
	private static double y;
	private double WIDTH;
	private double HEIGHT;

	public static Color myColor;

	public Ground() {
		myColor = new Color(0x13BD4E);
		x = 0;
		y = 590;
		WIDTH = 1800;
		HEIGHT = 10;
	}

	public void draw(Graphics g) {
		g.setColor((new Color(0x13BD4E)));
		g.fillRect((int) x, (int) y, (int) WIDTH, (int) HEIGHT);
		int[] k = { (int) x + 1500, (int) x + 1720, (int) x + 1630,
				(int) x + 1590 };
		int[] l = { (int) y, (int) y, (int) Target.getY() + 70,
				(int) Target.getY() + 70 };
		g.setColor(myColor);
		g.fillPolygon(k, l, 4);
		// cloud
		g.setColor(Color.white);
		g.fillOval(125, 50, 100, 45);
		g.fillOval(150, 40, 100, 50);
		g.fillOval(175, 60, 100, 40);
		// cloud
		g.fillOval(725, 90, 100, 45);
		g.fillOval(750, 70, 100, 50);
		g.fillOval(775, 95, 100, 40);
		// cloud
		g.fillOval(1425, 35, 100, 45);
		g.fillOval(1450, 15, 100, 50);
		g.fillOval(1490, 30, 100, 40);
	}

	public double getX() {
		return x;
	}

	public static double getY() {
		return y;
	}

}
