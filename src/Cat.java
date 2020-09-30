import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - no one needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 200;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/4;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/3;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	// Ears are about 20% from either side of the head
	private static final int EAR_X = (HEAD_DIMENSION/5)-20;
	private static final int EAR_Y = -40;
	private static final int EAR_SEPARATION = HEAD_DIMENSION/5 * 3;
	// pick ear dimensions
	private static final int EAR_HEIGHT = 75;
	private static final int EAR_WIDTH = 40;
	//make a fish
	private static final int FISH_X = HEAD_DIMENSION+30;
	private static final int FISH_Y = HEAD_DIMENSION/5 * 3;
	private static final int FISH_HEIGHT = 15;
	private static final int FISH_WIDTH = 90;
	private static final int FISH_EYE_X = HEAD_DIMENSION+40;
	private static final int FISH_EYE_Y = FISH_Y+5;
	private static final int FISH_EYE = 7;
	private static final int[] FISH_X_POINTS = {FISH_X+FISH_WIDTH-10,FISH_X+FISH_WIDTH+20,FISH_X+FISH_WIDTH+20};
	private static final int[] FISH_Y_POINTS = {FISH_EYE_Y,FISH_EYE_Y-15,FISH_EYE_Y+15};
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the ears
		//draw them first s that they are underneath the head
		g2.setColor(Color.black);
		x = catX + EAR_X; 
		y = catY + EAR_Y;
		g2.fillOval(x, y, EAR_WIDTH, EAR_HEIGHT);
		x += EAR_SEPARATION;
		g2.setColor(Color.white);
		g2.fillOval(x, y, EAR_WIDTH, EAR_HEIGHT);
		// Draw the head
		x=catX;
		y=catY;
		g2.setColor(Color.orange);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.red);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.pink);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		//draw fish
		g2.setColor(Color.gray);
		g2.fillOval(FISH_X, FISH_Y, FISH_WIDTH, FISH_HEIGHT);
		g2.fillPolygon(FISH_X_POINTS, FISH_Y_POINTS, 3);
		g2.setColor(Color.red);
		g2.fillOval(FISH_EYE_X, FISH_EYE_Y, FISH_EYE, FISH_EYE);
		
		g2.setColor(Color.blue);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("MEOW", catX, catY+HEAD_DIMENSION+10);	
		

	}
}
