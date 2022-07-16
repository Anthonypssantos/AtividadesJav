package List;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Controle controle = new	Controle();	
		
		ArrayList<String> recebe = new ArrayList<>();
		ArrayList<String> nome= new ArrayList<>();
		ArrayList<Integer> nota= new ArrayList<>();
		ArrayList<Integer> notasList = new ArrayList<>();
		ArrayList<String> reprovado= new ArrayList<>();
		ArrayList<String> aprovados = new ArrayList<>();
		
		int n1,n2, notas, notas2=0,casos=0, h=0, p=0, r=0;
		String c1 = "inicio", nomes, aprov = " ";
		
		do {
			
			casos = Integer.parseInt(JOptionPane.showInputDialog("1 para adicionar seu nome\n2 para ver a media da turma\n3 para ver os alunos passados\n4 para sair"));
			
			switch(casos) {
			
			//nome e nota
			case 1:{
				
				int t=0;
				
				t = Integer.parseInt(JOptionPane.showInputDialog("Coloque o numero de alunos que desejas cadastrar"));
				
				for (int i = 0; i < t; i++) {
					
					nomes = JOptionPane.showInputDialog("Coloque seu primeiro nome");
					
					n1 = Integer.parseInt(JOptionPane.showInputDialog("Nota (1)\nInsire sua nota de 1 a 100"));
					p++;
					n2 = Integer.parseInt(JOptionPane.showInputDialog("Nota (2)\nInsire sua nota de 1 a 100"));
					h++;
					
					r = p + h; 
					
					if(n1 > 100) {
						
						JOptionPane.showMessageDialog(null, "Nota invalida");
						n1 = 0;
					}
					
					if(n2 > 100) {
						
						JOptionPane.showMessageDialog(null, "Nota invalida");
						n2 = 0;
					}
						
					notas = n1 + n2;	
					notas2 += notas;
			
					if(notas > 100) {	
						aprov = "Aprovado";
						aprovados.add(nomes);
									
					}
					
					if(notas < 100) {
						aprov = "Reprovado";
						reprovado.add(nomes);
						
					}
					
					if(nomes.equals("fim")) {
						t = 0;
						c1 = "fim";
						nomes = null;
					
					}
					
					recebe.add(aprov);
					nome.add(nomes);		
					nota.add(notas);
							
				}
					
				controle.setNome(nome, nota);
				notasList.add(notas2);
				JOptionPane.showMessageDialog(null, notasList);
				h=0;
				
				break;
			}
			
			case 2:{
				
				controle.settotal(r, notasList);
				
				break;
			}
			
			case 3:{
				
				controle.setlist(nome,recebe, aprovados, reprovado);
				
				break;
			}
			
			default:{
				
				c1 = "fim";
				
				break;
			}
			
		}
			
		}while(c1 == "inicio");
		
	}
	
}
