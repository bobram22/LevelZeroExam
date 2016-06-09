
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	
    	// 3. ask the user what color they would like the Robot to draw
String red = JOptionPane.showInputDialog("choose a number");
String green = JOptionPane.showInputDialog("choose another number");
String blue = JOptionPane.showInputDialog("and another number");
int RED = Integer.parseInt(red);
int GREEN = Integer.parseInt(green);
int BLUE = Integer.parseInt(blue);
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

   	 // 2. set the pen width to 10

   	 // 1. make the Robot draw a shape
   	 Robot pizza = new Robot();
   	 pizza.penDown();
   	 pizza.setPenWidth(10);
  
	
		
   	if (RED > GREEN && RED > BLUE){
   		pizza.setPenColor(255, 0, 0);
   	}
   	else if (GREEN > RED && GREEN > BLUE){
   		pizza.setPenColor(0, 255, 0);
   	}	
   	else if (BLUE > GREEN && BLUE > RED){
   		pizza.setPenColor(0, 0, 255);
   	}
   	else{
   		pizza.setPenColor(0,0,0);
   	}
    	
		pizza.move(100);
   	pizza.turn(90);
	}
   	
    }


