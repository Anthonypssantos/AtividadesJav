package Atividade9;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class arraygordo {
	
	Random aleatorio = new Random();
	
	String pega="", compara="";
	int pergunta=0;
	
	ArrayList<String> c1 = new ArrayList<>();
	ArrayList<String> c2 = new ArrayList<>();
	ArrayList<String> c3 = new ArrayList<>();
	
	/*
	  
	 add elemento fora do conjunto
	 verificar se um dado pertence ao conjunto
	 printar o conunto 3 com elementos iguais do conjunto 1 e 2
	 printar o conjunto 4 com sem elementos repetidos e que não existam no conjunto passado
	  
	*/
	
	public void pegaString() {
		
		pergunta = Integer.parseInt(JOptionPane.showInputDialog("Quantos elementos você deseja inserir no array"));
		
		for(int i = 0; i < pergunta; i++) {
			
		pega = JOptionPane.showInputDialog("Adicione um 'nome' aleatório");
		
		c1.add(compara);
				
		}

	}
	
	public void compara() {
		
		for(int i = 0; i < pergunta; i++) {
			
			compara = c1.get(i);
			
			if(compara == c1.get(i)) {
				
				c2.add(compara);
				
			}else {
				
				c3.add(compara);
				
			}
			
		}
		printaiguais();
	}
	
	public void printaiguais() {
		
		for(int i = 0; i < c2.size(); i++) {
			
			System.out.println(c2.get(i));
			
		}
		
		printadif();
	}
	
	public void printadif() {
		
		for(int i = 0; i < c3.size(); i++) {
			
			System.out.println(c3.get(i));
			
		}
		
	}
	
}