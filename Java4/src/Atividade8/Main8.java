package Atividade8;

import javax.swing.JOptionPane;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double US;
		
		
		US = Double.parseDouble(JOptionPane.showInputDialog("Insire um valor em Dolar!"));
		
		JOptionPane.showMessageDialog(null, "Valor inserido: "+ US + "\nCotação do dolar convertida em reias está 5,15" );
	
	}

}
