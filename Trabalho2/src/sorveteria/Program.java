package sorveteria;

import java.text.DecimalFormat;

public class Program {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		String nomes[] = {"Ana", "João", "Marcio", "Carol", "Ze", "Carlos", "Julia", "Daniel", "Maria", "Bruno"};
		String sobrenomes[] = {"Garcia", "Nascimento", "Rodrigues", "Moreira", "Augusto", "Oliveira", "Damasceno", "Martins", "Madalena", "Martins"};
		double salarios[] = {1000.00, 2000.00, 2500.00, 3000.00, 3250.00, -4000.00, 4300.00, 9000.00, 2250.00, 3000.00};
		double ajustes[] =  {10.00, 15.00, 21.00, 5.00, 50.00, 20.00, 45.00, 7.5, 8.9, 32.7};
		double totFolha = 0.00;
		
		System.out.println("Lista de funcionários");
		System.out.println("");
		totFolha = lista(nomes, sobrenomes, salarios, totFolha);
		System.out.println("\nValor total da folha de pagamentos: " + df.format(totFolha));
		
		totFolha = 0.00;
		
		System.out.println("\nLista de funcionários (atualizada)");
		System.out.println("");
		totFolha = listaAtualizada(nomes, sobrenomes, salarios, ajustes, totFolha);
		System.out.println("\nValor total da folha de pagamentos: " + df.format(totFolha));
		

	}

	private static double lista(String[] nomes, String[] sobrenomes, double[] salarios, double totFolha) {
		for(int i = 0; i < 10; i++) {
			Funcionario func = new Funcionario(nomes[i], sobrenomes[i], salarios[i]);
			
			System.out.println("Nome: " + func.getPrimeiroNome() + " " + func.getSobrenome() + " -> Salário: " + func.getSalario());
			totFolha += func.getSalario();
			
		}
		return totFolha;
	}
	
	private static double listaAtualizada(String[] nomes, String[] sobrenomes, double[] salarios, double[] ajustes, double totFolha) {
		for(int i = 0; i < 10; i++) {
			Funcionario func = new Funcionario(nomes[i], sobrenomes[i], salarios[i]);
			
			func.aumentaSalario(ajustes[i]);
			System.out.println("Nome: " + func.getPrimeiroNome() + " " + func.getSobrenome() + " -> Salário: " +  func.getSalario());
			totFolha += func.getSalario();
		}
		return totFolha;
	}

}
