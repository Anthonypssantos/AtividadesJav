package Atividade4;

import javax.swing.JOptionPane;

<<<<<<< HEAD
import Atividade5.cplanoc;

=======
>>>>>>> 1028382ee4ed0dd5800557e58b6ed05fbaba7836
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
<<<<<<< HEAD
		
		int casos=0;
		
		boolean v = true;
		
		pc p = new pc();
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para add\n2 para ver se é igual ou diferente\n3 para sair"));
			
			switch(casos) {
			
			case 1:{
				int a=0, c=0;
				
				a = Integer.parseInt(JOptionPane.showInputDialog("adicione o numero linear"));
				c = Integer.parseInt(JOptionPane.showInputDialog("adicione o numero angular"));
				
				p.acesso(a, c);
				break;
				}
			case 2:{
				String r;
				
				r = p.retorna();
				
				JOptionPane.showMessageDialog(null, r);
				break;
				}
			default:{
				
				v = false;
				
				break;
				}
			
=======
		representaax r = new representaax();
		
		boolean v = true;
		
		int casos=0;
		String nome=" ";
		
		do {	
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para ver a dimensão de um pais setado"));
			
			switch(casos){
				
			case 1:{
				
			nome = JOptionPane.showInputDialog("Escolha 1 dos paises\nBrasil\nChina\nBragantins\nFaleza\nFaleza\nBaiania\nCloro\nValuzes\nLampada\nThortinha");
			
			r.construtor(nome);
				
			break;
			}
				
>>>>>>> 1028382ee4ed0dd5800557e58b6ed05fbaba7836
			}
			
		}while(v == true);
		
<<<<<<< HEAD
		
		
		
=======
>>>>>>> 1028382ee4ed0dd5800557e58b6ed05fbaba7836
	}

}
