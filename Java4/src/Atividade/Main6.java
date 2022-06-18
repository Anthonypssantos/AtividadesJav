package Atividade;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0, b=0, c=0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Insire um numero na variavel A!"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Insire um numero na variavel B!"));
		
		c = a;
		a = b;
		b = c;
		
		JOptionPane.showMessageDialog(null, "Valor A agora é:" +a+ "\nValor B agora é: " + b);
		
		
	}

}
