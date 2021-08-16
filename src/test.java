import java.util.Scanner;

public class test {

 public static void main(String[] args) 
 {
  
       System.out.println("\nCartesian to Polar Conversion"); 
       Scanner sc = new Scanner(System.in);
       
       System.out.println("\n Enter x-axis value : ");
       int x =sc.nextInt();
       System.out.println("\n Enter y-axis value : ");
       int y =sc.nextInt();
       
       
       double radius =  Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) );        
       double radiant = Math.atan(y/x);
       double angle = radiant * (180/Math.PI);
       
       System.out.println("Radius :"  + radius);
       System.out.println("Angle in radiant: "  + radiant);
       System.out.println("Angle in degree: "  + angle);
 }

}