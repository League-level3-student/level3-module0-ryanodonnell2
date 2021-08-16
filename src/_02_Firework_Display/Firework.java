package _02_Firework_Display;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*
 * 
 * You can think of a fire work as an array of sparks. Run the demo jar to see the finished product
 * then complete the steps. 
 *
 */

public class Firework{
	public static final int GRAVITY = 1;
	Random r = new Random();
	
	//1. Create an array of Spark objects called sparks. Don't initialize it.
	Spark[] sparks;
	Color[] sparksColor;
	public boolean dead = false;
	int totalSparks = 2500;
	
	public Firework() {
		//2. Initialize the Spark array to contain 100 Sparks. 
		sparks = new Spark[totalSparks];
		sparksColor = new Color[totalSparks];
		//3. Iterate through the sparks and initialize each one to a new Spark.
		//   Make each spark start at the middle bottom of the screen.
		for(int i = 0; i<sparks.length; i++) {
			sparks[i] = new Spark(FireworkDisplay.WIDTH/2,FireworkDisplay.HEIGHT);
		}
		for(int i = 0; i<sparksColor.length; i++) {
			sparksColor[i] = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
		}
	}
	
	public void launch() {
		//4. Iterate through the sparks and reset their x and y location
		//   to their original starting point.
		for(int i = 0; i<sparks.length; i++) {
			sparks[i] = new Spark(FireworkDisplay.WIDTH/2,FireworkDisplay.HEIGHT);
		}
	}
	
	public void updateSparks() {
		//8. Uncomment this code. See if you can understand what it is doing.
		
		for(int i = 0; i < sparks.length; i++) {

			Spark s = sparks[i];
			s.x += s.xVelocity;
			s.y += s.yVelocity;
			s.yVelocity += GRAVITY;
			int spreadX = 30;
			int spreadY = 20;
			int fireTimeFromTopOfParabola = -5;
			if(s.yVelocity >= fireTimeFromTopOfParabola && !s.fire) {
				Random r = new Random();
				s.xVelocity = r.nextInt(spreadX) - spreadX/2;
				s.yVelocity += -r.nextInt(spreadY) -spreadY/2;
				s.size = r.nextInt(7) + 2;
				s.fire = true;
			}
			
			if(s.y >= FireworkDisplay.HEIGHT) {
				s.dead = true;
			}
		}
		
		for(int i = 0; i < sparks.length; i++) {
			if(!sparks[i].dead) {
				dead = false;
				break;
			}
			dead = true;
		}
	}
	
	public void drawSparks(Graphics g) {
		//5. Iterate through each spark
		for(int i = 0; i < sparks.length; i++) {
			//6. Set the color to the spark's color with g.setColor()
			g.setColor(sparksColor[i]);
			//7. Fill in an oval using the spark's x, y, and size with g.fillOval()
			g.fillOval(sparks[i].x,sparks[i].y,10,10);
		}
	}
}
