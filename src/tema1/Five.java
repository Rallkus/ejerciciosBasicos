package tema1;

import javax.swing.JOptionPane;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, num4, num5= 0;
		num1= Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer n�mero"));
		num2= Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo n�mero"));
		num3= Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer n�mero"));
		num4= Integer.parseInt(JOptionPane.showInputDialog("Introduce el cuarto n�mero"));
		num5= Integer.parseInt(JOptionPane.showInputDialog("Introduce el quinto n�mero"));
		
		JOptionPane.showMessageDialog(null, num1 + num2 + num3 + num4 + num5);
	}

}
