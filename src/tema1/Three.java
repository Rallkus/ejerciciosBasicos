package tema1;

import javax.swing.JOptionPane;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, aux=0;
		num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer n�mero"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo n�mero"));
		aux=num1;
		num1=num2;
		num2=aux;
		JOptionPane.showMessageDialog(null, "El primer n�mero ahora es : " + num1 +"\nY el segundo n�mero ahora es : " + num2);
	}

}
