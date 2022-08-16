package Atividade2;

import javax.swing.JOptionPane;

public class Ponto2D {
	/*Add, acesso, movimentar, comparar, representação, calcular a distancia, um clone*/
	
	int a=0, b=0, r=0, ma=0, mb=0;
	
	public void add() {
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Coloque o ponto 1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Coloque o ponto 2 igual ou diferente"));
		
		acesso();
	}
	public void acesso() {
		
		JOptionPane.showMessageDialog(null, "Plano cartesiano: "+a + b);
		
	}
	public String movimentos() {
		String envia="";
		
		ma = a;
		mb = b;
		envia = " pontos movimentados";
		
		return envia;
	}
	public void comparaerepresentacao() {
		
		if(ma == mb) {
			
			JOptionPane.showMessageDialog(null, "Pontos iguais");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Pontos diferentes");
			
		}
		calc();
	}
	public void calc() {
		
		if(ma == mb) {
			
			JOptionPane.showMessageDialog(null, "A distancia dos pontos é igual a 0 por serem iguais");
			
		}else {
		
		int h=0;	
			
		 h = ma + mb;
		
		JOptionPane.showMessageDialog(null, "Distancia: "+ h);	
			
		}
			
	}
	public void clonar() {
		
		a = ma;
		b = mb;
		
		JOptionPane.showMessageDialog(null, "Cartão clonado");
		
	}

}