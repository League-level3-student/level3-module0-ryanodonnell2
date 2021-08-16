package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot name1 = new Robot();
		Robot name2 = new Robot();
		Robot name3 = new Robot();
		Robot name4 = new Robot();
		Robot name5 = new Robot();
		Robot[] robots = {name1, name2, name3, name4, name5};
		Random r = new Random();
//		for (int i = 0; i < robots.length; i++) {
//			robots[i] = new Robot();
//		}
		for (int i = 0; i < robots.length; i++) {
			int rad =100;
		      
		      int angle = 0;
		      double x = rad*Math.cos(angle);
		      double y = rad*Math.sin(angle);
		      x = x+400;
		      y = y+300;
		      robots[i].moveTo((int)x,(int)y);
			robots[i].moveTo((int)x, (int)y);
			System.out.println(robots[i]);
			robots[i].setSpeed(9999999);
		}
	
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.
		//done
			//4. make each robot start at the bottom of the screen, side by side, facing up
		// done
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		String winner = "";
		int angle = 0;
    	while(name1.getY()>0&&name2.getY()>0&&name3.getY()>0&&name4.getY()>0&&name5.getY()>0) {
//    		for (int i = 0; i < robots.length; i++) {
//    			robots[i].move(r.nextInt(50));
//    		}
    		for (int i = 0; i < robots.length; i++) {
//    			for (int j = 0; j < r.nextInt(50); j++) {		       
//    			       //double radius =  Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) );        
//    			       //double radiant = Math.atan(y/x);
//    			       //double angle = radiant * (180/Math.PI);
//    			       
//    			      
//				}
    			  int rad =100;  
    		      double radiant = Math.atan(robots[i].getY()/robots[i].getX());
    		      double angle2 = radiant * (180/Math.PI);
			      int target = r.nextInt(50)+(int)angle2;
			      if(angle>=350) {
			    	  robots[i].sparkle();
			    	  break;
			      }
			      double x = rad*Math.cos(angle);
			      double y = rad*Math.sin(angle);
			      x = x+400;
			      y = y+300;
			      robots[i].moveTo((int)x,(int)y);
    		}
    		break;
    	}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		//7. declare that robot the winner and throw it a party!
    	int locX = 400;
    	int locY = 300;
    	if(name1.getY()>0) {
    		name1.moveTo(locX, locY);
    		name1.sparkle();
		}
    	else if(name2.getY()>0) {
    		name2.moveTo(locX, locY);
    		name2.sparkle();
		}
    	else if(name3.getY()>0) {
    		name3.moveTo(locX, locY);
    		name3.sparkle();
		}
    	else if(name4.getY()>0) {
    		name4.moveTo(locX, locY);
    		name4.sparkle();
		}
    	else if(name5.getY()>0) {
    		name5.moveTo(locX, locY);
    		name5.sparkle();
		}
  
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
	
}

