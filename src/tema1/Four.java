package tema1;

import javax.swing.JOptionPane;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		String cad = "";
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		for(int i = 0; i<10; i++) {
			cad = cad + (num * (i+1)) + "\n";
		}
		JOptionPane.showMessageDialog(null, cad);
	}

}
