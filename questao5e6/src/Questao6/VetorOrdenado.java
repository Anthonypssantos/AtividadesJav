package Questao6;

import java.util.Arrays;
import java.util.Collections;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class VetorOrdenado extends VetorCorrente{
	
	VetorCorrente vtct = new VetorCorrente();
	ArrayList<String> nome = new ArrayList();
	String h="";
	
	public void contructor() {
		
		for(int i=0; i <= 1; i++) {
			
			h = JOptionPane.showInputDialog("Coloque uma String");
			
			nome.add(h);	
				
		}
		
		Collections.sort(nome);
		insert();
		
	}
	
	public void insert() {
	
		for(int i=0; i <= 1; i++) {
			
			h = JOptionPane.showInputDialog("Coloque '+' 5 Strings");

			nome.add(h);	
				
		}
		
		Collections.sort(nome);
		get();
		
	}
	
	public void get() {
			
			for(int i=0;i<4;i++) {
								
					System.out.println(nome.get(i));
						
			}
		
			merge();
	}
	
	public void merge() {
	
		for(int i = 0; i < 4; i++) {
			
			vtct.setVet2(nome);
					
		}
		
		for(int i = 0; i < 1; i++) {
			
			System.out.println(vtct.getVet2());
			
		}
		
			
	}
	
	public void size() {
		
		for(int i=0; i <= 15; i++) {
			
			System.out.println(nome.get(i));
			
		}
			
	}
		
}
