
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String pizza = JOptionPane.showInputDialog("what is your age");
		int Age = Integer.parseInt(pizza);
		if (Age == 1){
			JOptionPane.showMessageDialog(null, "you were born in 2015");
		}
		else if (Age == 2){
			JOptionPane.showMessageDialog(null, "you were born in 2014");
		}
		else if (Age == 3){
			JOptionPane.showMessageDialog(null, "you were born in 2013");
		}
		else if (Age == 4){
			JOptionPane.showMessageDialog(null, "you were born in 2012");
		}
		else if (Age == 5){
			JOptionPane.showMessageDialog(null, "you were born in 2011");
		}
		else if (Age == 6){
			JOptionPane.showMessageDialog(null, "you were born in 2010");
		}
		else if (Age == 7){
			JOptionPane.showMessageDialog(null, "you were born in 2009");
		}else if (Age == 8){
			JOptionPane.showMessageDialog(null, "you were born in 2008");
		}else if (Age == 9){
			JOptionPane.showMessageDialog(null, "you were born in 2007");
		}else if (Age == 10){
			JOptionPane.showMessageDialog(null, "you were born in 2006");
		}else if (Age == 11){
			JOptionPane.showMessageDialog(null, "you were born in 2005");
		}
		else if (Age == 12){
			JOptionPane.showMessageDialog(null, "you were born in 2004");
		}else if (Age == 13){
			JOptionPane.showMessageDialog(null, "you were born in 2003");
		}else if (Age == 14){
			JOptionPane.showMessageDialog(null, "you were born in 2002");
		}else if (Age == 15){
			JOptionPane.showMessageDialog(null, "you were born in 2001");
		}
		else if (Age == 16){
			JOptionPane.showMessageDialog(null, "you were born in 2000");
		}else if (Age == 17){
			JOptionPane.showMessageDialog(null, "you were born in 1999");
		}else if (Age == 18){
			JOptionPane.showMessageDialog(null, "you were born in 1998");
		}else if (Age == 19){
			JOptionPane.showMessageDialog(null, "you were born in 1997");
		}else if (Age == 20){
			JOptionPane.showMessageDialog(null, "you were born in 1996");
		}else if (Age == 21){
			JOptionPane.showMessageDialog(null, "you were born in 1995");
		}
		else if (Age == 22){
			JOptionPane.showMessageDialog(null, "you were born in 1994");
		}else if (Age == 23){
			JOptionPane.showMessageDialog(null, "you were born in 1993");
		}else if (Age == 24){
			JOptionPane.showMessageDialog(null, "you were born in 1992");
		}else if (Age == 25){
			JOptionPane.showMessageDialog(null, "you were born in 1991");
		}else if (Age == 26){
			JOptionPane.showMessageDialog(null, "you were born in 1990");
		}
		else if (Age == 27){
			JOptionPane.showMessageDialog(null, "you were born in 1989");
		}else if (Age == 28){
			JOptionPane.showMessageDialog(null, "you were born in 1988");
		}else if (Age == 29){
			JOptionPane.showMessageDialog(null, "you were born in 1987");
		}else {
			JOptionPane.showMessageDialog(null, "You too dam old to play this game");
		}
	}


}