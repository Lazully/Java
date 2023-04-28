import javax.swing.JOptionPane;

public class Principal {

  public static void main(String[] args) {
  // TODO Auto-generated method stub
		
	Habitante vetHabitante [] = new Habitante[3];
	
	for(int i=0; i<vetHabitante.length; i++){

		double salario = Double.parseDouble( JOptionPane.showInputDialog("Digite o salario " + (i+1) + ": ") );
		int idade = Integer.parseInt(  JOptionPane.showInputDialog("Digite a idade " + (i+1) + ": ") );
		int numero_filhos = Integer.parseInt( JOptionPane.showInputDialog("Digite o numero de filhos " + (i+1) + ": ") );

		vetHabitante[i] = new Habitante(salario, idade, numero_filhos);
	}
	
	double mediaSalario = mediaSalario( vetHabitante );
	double mediaNoFilhos = mediaNoFilhos( vetHabitante );
	double maiorSalario = calculaMaiorSalario( vetHabitante );
	
	String auxiliar = "Média dos salários dos habitantes: " + mediaSalario;
	auxiliar = auxiliar + "\nMédia do número de filhos: " + mediaNoFilhos;
	auxiliar = auxiliar + "\nMaior salário: " + maiorSalario;

	JOptionPane.showMessageDialog(null, auxiliar, "Resposta ao usuário", JOptionPane.INFORMATION_MESSAGE);

  }
  
  //funcao para calcular a media de salário
  public static double mediaSalario( Habitante vetorDeHabitante [] ) {
	  
	  double media = 0;
	  for(int i=0; i<vetorDeHabitante.length; i++){	  
		  media += vetorDeHabitante[i].getSalario();
	  }
	  
	  media = media/vetorDeHabitante.length;
	  
	  return media;
  }
  

  //funcao para calcular a media de filhos
  public static double mediaNoFilhos( Habitante vetorDeHabitante [] ) {
	  
	  double media = 0;
	  for(int i=0; i<vetorDeHabitante.length; i++){	  
		  media += vetorDeHabitante[i].getNumero_filhos();
	  }
	  
	  media = media/vetorDeHabitante.length;
	  
	  return media;
  }
  
  public static double calculaMaiorSalario( Habitante vetHabit[] ) {
	  
	  double maiorSal = vetHabit[0].getSalario();
	  
	  for(int i=1; i<vetHabit.length; i++) {
		  
		  if (maiorSal < vetHabit[i].getSalario()) {
			  maiorSal = vetHabit[i].getSalario();
		  }
	  }
	  
	  return maiorSal;
	  
  }
}
