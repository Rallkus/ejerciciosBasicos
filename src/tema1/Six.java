package tema1;

import javax.swing.JOptionPane;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, suma = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
			suma += num; // equivalente a suma = suma + num;
		} while (num != 0);

		JOptionPane.showMessageDialog(null, "La suma de los números introducidos es : " + suma);
	}

}
