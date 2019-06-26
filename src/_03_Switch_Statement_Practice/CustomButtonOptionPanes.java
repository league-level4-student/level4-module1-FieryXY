package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "The sun goes up and your happy. The sun goes down and your mentally preparing for school tomorrow.");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Pokemon come on Monday. Idk y they named it Pokemonday but whatever.");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Two days in one. Tuesday is boring and fun!");
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "This is supposed to be cool.");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "So close yet so far.....weekend..");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Yay its the weekend");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Yay you made it!");
		}
		
	}
}
