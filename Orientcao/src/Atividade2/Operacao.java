package Atividade2;

import java.util.Random;

import javax.swing.JOptionPane;

public class Operacao {

	public void n(int a, int valor) {
		int r=0;
		
		r = valor;
		
	JOptionPane.showMessageDialog(null, a+" "+ r);
		
	while(a != r) {
		
		JOptionPane.showMessageDialog(null, "Numero invalido");
		
		
		if (a > r) {
			JOptionPane.showMessageDialog(null, r);
			JOptionPane.showMessageDialog(null, "O valor esta mais alto que o numero gerado");
			a = Integer.parseInt(JOptionPane.showInputDialog("Tente de novo"));
			
		}
		
		if(a < r) {
			
			JOptionPane.showMessageDialog(null, r);
			JOptionPane.showMessageDialog(null, "O valor esta baixo do numero gerado");
			a = Integer.parseInt(JOptionPane.showInputDialog("Tente de novo"));
			
			}
	
		if (a == r) {
			
			JOptionPane.showMessageDialog(null, "Parabéns acertaste");
			
		}
	
		}
	}
}
