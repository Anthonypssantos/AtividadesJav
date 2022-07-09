package Atividade;

import javax.swing.JOptionPane;

public class Operacao {
	
	public String[] lancamento(String[] nome, int p) {
		boolean c2 = true;
		int caso, h=0, r=0;
		String v;
		String[] armazena = new String[5];
		String[] alocado = new String[5];
		
		armazena[0] = "Fogo";
		armazena[1] = "Terra";
		armazena[2] = "Agua";
		armazena[3] = "Ferro";
		armazena[4] = "Madeira";
		
		v = JOptionPane.showInputDialog("Lançamentos \n"+ armazena[0]+ "\n"+armazena[1]+ "\n"+armazena[2]+"\n"+armazena[3]+"\n"+armazena[4]+"\n\nColoque o nome do filme para alugalo Ex: 'Fogo'");		
		alocado[3] = v;
		
		do {
			
			caso = Integer.parseInt(JOptionPane.showInputDialog("1 para alocar outros livros\n 2 para não alocar outros livros"));
			
			switch(caso) {
			
			case 1:{
				
				p = Integer.parseInt(JOptionPane.showInputDialog("Você só pode cadastrar 3 livros no máximo"));
				p++;
				
				for (int i = 0; i <= p; i++) {
					
					alocado[i] = JOptionPane.showInputDialog("Aloque "+ (p-1) +" filmes/e");
					p--;
					h++;
					JOptionPane.showMessageDialog(null, "Filmes alugados "+ alocado[i]);
				
				}
				
				r = 4 * h;
						
				for (int i = 0; i <= p+2; i++) {
					
					System.out.println("Filmes alugados "+ alocado[i]);
					
				}
				System.out.println("Valor total é de: "+r+" Reais");
				
				break;
			
			}
			
			default:{
				c2 = false;
				break;
			}
				
		}
			
		}while(c2 == true);
		
		if (caso == 2) {
			
			r = 4;		
			JOptionPane.showMessageDialog(null, "Livro cadastrado: "+v+"\nValor total de: "+r+" Reais");
			
		}
		
		return alocado;
	}
	
	public void promos(int Desconts, String[] nome) {
		int promo=0;
		String[] descontos = new String[5]; 
		String v;
		int caso, h=0, p=0, r=0;
		boolean c3 = true;

		descontos[0] = "Torre"; 
		descontos[1] = "Balça";
		descontos[2] = "Marreta";
		descontos[3] = "Vidro";
		descontos[4] = "Barro";
		
		v = JOptionPane.showInputDialog("Lançamentos \n"+descontos[0]+ "\n"+descontos[1]+ "\n"+descontos[2]+"\n"+descontos[3]+"\n"+descontos[4]+"\n\nColoque o nome do filme para alugalo Ex: 'Fogo'");		
		descontos[3] = v;
		
		do {
			
			caso = Integer.parseInt(JOptionPane.showInputDialog("1 para alocar outros livros\n 2 para não alocar outros livros"));
			
			switch(caso) {
			
			case 1:{
				
				p = Integer.parseInt(JOptionPane.showInputDialog("Você só pode cadastrar 3 livros no máximo"));
				p++;
				
				for (int i = 0; i <= p; i++) {
					
					descontos[i] = JOptionPane.showInputDialog("Aloque "+ (p-1) +" filmes/e");
					p--;
					
					JOptionPane.showMessageDialog(null, "Filmes alugados "+ descontos[i]);
					h++;
					
					
				}
				
				
		
				r = 2 * h;	
					
				for (int i = 0; i <= p+2; i++) {
					
					System.out.println("Filmes alugados "+ descontos[i]);
					
				}
				System.out.println("Desconto de: "+ (r+2)+ "Reais");
				
				break;
			
			}
			
			default:{
				c3 = false;
				break;
			}
				
		}
			
		}while(c3 == true);
		
		if (caso == 2) {
			
			r = 2;
			
			JOptionPane.showMessageDialog(null, "Livro cadastrado: "+v+"\nValor de: "+r);
			
		}
		
	}
	
	public String[] infantil(String[] nome, int p) {
		
		
		boolean c4 = true;
		int caso, h=0, r=0;
		String v;
		String[] armazena = new String[5];
		String[] infantil = new String[5];
		
		armazena[0] = "Baby";
		armazena[1] = "RogérioMen";
		armazena[2] = "VoandoBaixo";
		armazena[3] = "LargartaM.R";
		armazena[4] = "A fuga da palestrinha";
		
		v = JOptionPane.showInputDialog("Lançamentos \n"+ armazena[0]+ "\n"+armazena[1]+ "\n"+armazena[2]+"\n"+armazena[3]+"\n"+armazena[4]+"\n\nColoque o nome do filme para alugalo Ex: 'Fogo'");		
		infantil[3] = v;
		
		do {
			
			caso = Integer.parseInt(JOptionPane.showInputDialog("1 para alocar outros livros\n 2 para não alocar outros livros"));
			
			switch(caso) {
			
			case 1:{
				
				p = Integer.parseInt(JOptionPane.showInputDialog("Você só pode cadastrar 3 livros no máximo"));
				p++;
				
				for (int i = 0; i <= p; i++) {
					
					infantil[i] = JOptionPane.showInputDialog("Aloque "+ (p-1) +" filmes/e");
					p--;
					h++;
					JOptionPane.showMessageDialog(null, "Filmes alugados "+ infantil[i]);
				
				}
				
				r = 6 * h;
						
				for (int i = 0; i <= p+2; i++) {
					
					System.out.println("Filmes alugados "+ infantil[i]);
					
				}
				System.out.println("Valor total é de: "+r+" Reais");
				
				break;
			
			}
			
			default:{
				c4 = false;
				break;
			}
				
		}
			
		}while(c4 == true);
		
		if (caso == 2) {
			
			r = 6;		
			JOptionPane.showMessageDialog(null, "Livro cadastrado: "+v+"\nValor total de: "+r+" Reais");
			
		}
		
		return nome;
	}

}
