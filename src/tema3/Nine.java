package tema3;

import javax.swing.JOptionPane;

public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, num = 0;
		int producto = 1;
		String cad = "";

		n = Integer
				.parseInt(JOptionPane.showInputDialog("Introduce el n�mero de veces que quieres introducir un n�mero"));

		for (int i = 0; i < n; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
			producto = producto * num;
		}
		cad = "El producto de todos los n�meros introducidos es : " + producto;
		JOptionPane.showMessageDialog(null, cad);
	}

}
