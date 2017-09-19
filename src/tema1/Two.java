package tema1;

import javax.swing.JOptionPane;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2 = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
		num2= Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
		if(num1>num2)
			JOptionPane.showMessageDialog(null, num1 + " es mayor que " + num2);
		else if(num2>num1)
			JOptionPane.showMessageDialog(null, num1 + " es menor que " + num2);
		else
			JOptionPane.showMessageDialog(null, num1 + " y " + num2 + "son iguales");
	}

}
