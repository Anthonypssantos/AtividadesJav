package Atividade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario Finc = new Funcionario();
		
		boolean c = true;
		
		String nome, cpf, casos,matricula, adm;
		Double salario=0.0;
		Double desconto=0.0;
		Double r=0.0, d=0.0,r2;
	
		do {
		
			
			casos = JOptionPane.showInputDialog("Escreva 'addfuncionario' para adicionar um funcionario\nEscreva 'aumento' para acrescentar um aumento\nEscreva 'ganhoanualbruto' para ver o seu Ganho Anual\nEscreva 'ganholiquidomensal' para ver seu Ganho Liquido Mensal\nEscreva 'imposto' para ver seu imposto\nEscreva 'ganholiquidoanual' para ver seu Ganho Liquido Anual\nEscreva 'dados' para ver seus dados pessoas Exemplo: Nome, salario e etc...\nEscreva 'sair' para sair do programa");
			
			switch(casos) {
			
			case "addfuncionario":{
				
				nome = JOptionPane.showInputDialog("Coloque seu nome");
				salario = Double.parseDouble(JOptionPane.showInputDialog("Coloque seu salario"));
				cpf = JOptionPane.showInputDialog("Coloque seu cpf");
				adm = JOptionPane.showInputDialog("Coloque sua data de admissão");
				matricula = JOptionPane.showInputDialog("Coloque sua Matricula");
				
				if(salario <= 2500.0) {
					
					d = salario;
					
					desconto = salario * 0.11;
					
					salario -= desconto;
						
				}
				if(salario > 2500.0) {
					
					desconto = salario * 0.11 * 17.5;
					
					salario -= salario;
					
				}
				
				Finc.setNome(nome);
				Finc.setCpf(cpf);
				Finc.setMatricula(matricula);
				Finc.setSalario(salario);
				Finc.setAddms(adm);
				
				break;
				}
			
			case "aumento":{
									
				Finc.aumento();
							
				break;
				}
			
			case "ganhoanualbruto":{
				
				r = d * 12;
				JOptionPane.showMessageDialog(null, r);
				
				break;
				}
			
			case "ganholiquidomensal":{
				
				Finc.cglm();
				
				break;
				}
			
			case "imposto":{
				
				if (d < 1900) {
		           	JOptionPane.showMessageDialog(null, "nao ha deducao fiscal");

		        } else if (d >= 1900.00 && d < 2800.00) {
		               JOptionPane.showMessageDialog(null, "A deducao fiscal e de 7.5%"); 
		               JOptionPane.showMessageDialog(null, "Voce deve deduzir o valor de " + d * 0.075 + " reais"); 
		               
		        } else if (d >= 2800.00 && d < 3751.00) {
		               JOptionPane.showMessageDialog(null, "A deducao fiscal e de 15%"); 
		               JOptionPane.showMessageDialog(null, "Voce deve deduzir o valor de " + d * 0.15 + " reais"); 

		        } else if (d >= 3751.00 && d < 4664.00) {
		               JOptionPane.showMessageDialog(null, "A deducao fiscal e de 22,5%");
		               JOptionPane.showMessageDialog(null, "Voce deve deduzir o valor de " + d * 0.225 + " reais");

		        } else {
		               JOptionPane.showMessageDialog(null,"A deducao fiscal e de 27,5%");
		               JOptionPane.showMessageDialog(null,"Voce deve deduzir o valor de " + d * 0.275 + " reais");
		        }
				
				break;
				}
			
			case "ganholiquidoanual":{
				
				r2 = salario * 12.0;
				JOptionPane.showMessageDialog(null, r2);
				
				break;
				}
			
			case "dados":{
				
				Finc.dados();
				
				break;
			}
			
			case "sair":{
				
				c = false;
				
				break;
			}
			
			
			
			}
			
		}while(c == true);
			
		
		
	}

}
