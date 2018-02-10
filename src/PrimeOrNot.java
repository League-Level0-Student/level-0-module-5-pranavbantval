import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
	
	for (int i = 0; i < 10; i++) {
		boolean primeJudge = true;	
		String  userNum = JOptionPane.showInputDialog("Pick any number.");
		int num = Integer.parseInt(userNum);
	for (int j = 2; j < num; j++) {
		if(num%j==0 && j!=num) {
			primeJudge = false;
		break;
		}

	}
	if(primeJudge==true) {
		JOptionPane.showMessageDialog(null, "Your number is prime!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Your number is not prime.");
	}
	}
}
}
