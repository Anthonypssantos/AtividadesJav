package Atividade2;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Operacao op = new Operacao();
		Random h = new Random();
		int valor = h.nextInt(100) + 1;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("coloque um numero"));
		
		op.n(a, valor);
		
	}
}
