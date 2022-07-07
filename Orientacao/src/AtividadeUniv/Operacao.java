package AtividadeUniv;

import javax.swing.JOptionPane;

public class Operacao {
		
	public String Univ(String nome, int Univ, String nuniv) {
		
		
		if (nuniv == "Princeton") {
			
			JOptionPane.showMessageDialog(null, "Nome: "+nome+" Universidade atual "+nuniv+" em Nova Jersey");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Nome: "+nome+" Universidade atual "+nuniv+" na Inglaterra");
			
		}
		
		return nome;
	}
	
	public void dadosE() {
		
		JOptionPane.showMessageDialog(null, "Nome: Albert Einsten\nProfessor de Fisica em Nova Jersey - Estados Unidos da América\nData de nascimento: 14/03/1879");
		
	}
	
	public void dadosI() {
		
		JOptionPane.showMessageDialog(null, "Nome: Isaac Newton\nProfessor de Matematica em Cambrige - Inglaterra\nData de nascimento: 4/01/1643");
		
	}
	
}
