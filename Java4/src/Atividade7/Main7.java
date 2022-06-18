package Atividade7;

import javax.swing.JOptionPane;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int c, f;
		
		c = Integer.parseInt(JOptionPane.showInputDialog("Insira graus celcius"));
		
		f = (9*c+160)/5;
		
		JOptionPane.showMessageDialog(null, "Temperatura em F: "+ f);
		
	}

}
