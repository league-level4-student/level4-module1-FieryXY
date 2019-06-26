package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
		public void doHoro(Zodiac z) {
			switch(z) {
			case ARIES:
				JOptionPane.showMessageDialog(null, "You will become a cool guy that goes to the NASA hotel");
				break;
			case TAURUS:
				JOptionPane.showMessageDialog(null, "You will start a war");
				break;
			case GEMINI:
				JOptionPane.showMessageDialog(null, "You are an agile fighter for justice");
				break;
			case CANCER:
				JOptionPane.showMessageDialog(null, "You are immune to diseases and bodily harm");
				break;
			case LEO:
				JOptionPane.showMessageDialog(null, "You are the protector and speaker of animals");
				break;
			case VIRGO:
				JOptionPane.showMessageDialog(null, "You're bad");
				break;
			case LIBRA:
				JOptionPane.showMessageDialog(null, "You are academically intelligent.");
				break;
			case SCORPIO:
				JOptionPane.showMessageDialog(null, "You can manipulate anyone to do anything");
				break;
			case SAGITTARIUS:
				JOptionPane.showMessageDialog(null, "You will live 1 million years and become the catalyst of wisdom in the 23rd century");
				break;
			case CAPRICORN:
				JOptionPane.showMessageDialog(null, "The sign: Capricorn is invalid. Please try again.");
				break;
			case AQUARIUS:
				JOptionPane.showMessageDialog(null, "You can breathe underwater and survive in outer space");
				break;
			case PISCES:
				JOptionPane.showMessageDialog(null, "You can blow up planets");
				break;
			}
		}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		new _00_Horoscope().doHoro(Zodiac.ARIES);
	}
	
}
