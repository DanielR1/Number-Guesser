package day5;
import java.util.Random;

import javax.swing.JOptionPane;
public class HighLow {


	// Copyright Wintriss Technical Schools 2013
	

		public static void main(String[] args) {

			int random = new Random().nextInt(100);
			
			int x = 10;
			
			// 11. do the following 10 times
			for (int i = 0; i < 10; i++) {
				
			
				
				String responsenull = JOptionPane.showInputDialog("Guess the number between 1-100! You have "+x+" more tries");

		
				int response = Integer.parseInt(responsenull);
				
				
		
				if(response == random){
					JOptionPane.showMessageDialog(null, "You win!");
					System.exit(0);
					
				}
				
					
				
		if(response>random){
			JOptionPane.showMessageDialog(null, "Too high!");
			x -=1;
		}
		
			
				
		if(response<random){
			JOptionPane.showMessageDialog(null, "Too low!");
			x -=1;
		}
		}


			// 12. tell them they lose
		JOptionPane.showMessageDialog(null, "You lose ;-;");
		}

	}

