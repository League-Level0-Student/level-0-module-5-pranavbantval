import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	int x = 2;
	boolean primeJudge;
	for (int i = 0; i < 10; i++) {
		String  userNum = JOptionPane.showInputDialog("Pick any number.");
		int num = Integer.parseInt(userNum);
		for(int j = 0; j<100; j++) {
			if(num%x==0) {
				primeJudge=false;
			}
			else {
				primeJudge=true;
			}
			x++;
		}
		if(primeJudge=!false) {
			JOptionPane.showMessageDialog(null, "Your number is not prime.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Your number is prime.");	
		}
	}
}
}
