package Atividade1;

import java.io.Reader;

import javax.swing.JOptionPane;

public class Operacao {
	
	public boolean primo(int a) {
		
		int primo=0, h=0, r=0;
			
		if (a == 0 || a == 1) {
			
			return false;
		}else{
			
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					
					return false;
				}

			}
			
		}
		
		return true;
		
	}
}
