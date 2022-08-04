import java.util.ArrayList;

import javax.swing.JOptionPane;

public class List {
	
	//Chamadas das classes
	Mercado m = new Mercado();
	ExerciciosF excc = new ExerciciosF();
	Escola esc = new Escola();
	
	//array tipo string 
	ArrayList<String> Lista = new ArrayList<>();
	
	//Variaveis String
	String nome=" ", rtipo =" ";
	
	//Estrutura de repetição
	boolean c = true;
	
	//Metodo listas
	public void Lis(String rtipo) {
		
		if(rtipo.equals("Mercado")) {
			
			
			
		}if(rtipo.equals("Exercicios fisicos")){
		
			
			
		}if(rtipo.equals("Escola")) {
			
			
			
		}if(rtipo.equals("Mercado")) {
			
			
			
		}if(rtipo.equals("Mercado")) {
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Oops! Algo digitado errado.\nPor favor digite de novo exatamente como o programa mostra");
			return;
		
		}
	}
}
