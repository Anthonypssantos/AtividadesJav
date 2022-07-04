package Atividade3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Operacao op = new Operacao();	
	String n = new String();
	String n2 = new String();
	String r2 = new String();
	
	n = JOptionPane.showInputDialog("Coloque um numero");
	n2 = JOptionPane.showInputDialog("Coloque um numero");
	
	op.numero(n, n2, r2);
	
	
	}
}
