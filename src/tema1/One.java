package tema1;

import javax.swing.JOptionPane;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3 = 0;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

		JOptionPane.showMessageDialog(null, "La media es : " + (num1 + num2 + num3) / 3.0f);

	}

}
