package Questao6;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class VetorOrdenado {
	
	
	ArrayList<String> vet = new ArrayList();
	String h="";
	
	public void contructor() {
		
		for(int i=0; i <= 5; i++) {
			
			h = JOptionPane.showInputDialog("Coloque uma String");
			
			vet.add(h);	
			
		}
		
		insert();
		
	}
	
	public void insert() {
		
		for(int i=0; i <= 5; i++) {
			
			h = JOptionPane.showInputDialog("Coloque '+' 5 Strings");
			
			vet.add(h);	
			
		}
		
		get();
		
	}
	
	public void get() {
		String l = "";
			
			l = JOptionPane.showInputDialog("Teste");
			
			for(int i=0;i<10;i++) {
								
					System.out.println("Nome buscado: "+3+"\n=======");
						
			}
		
	size();
	}
	
	public void size() {
		
		for(int i=0; i <= 10; i++) {
			
			System.out.println(vet.get(i));	
			
		}
		
		
	}
	
	
	
	
}
