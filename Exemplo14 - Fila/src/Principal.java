import javax.swing.*;

public class Principal{

	public static void main(String[] args) {
		
		Fila intFila = new Fila(10);
		int i, entrada = 0;
		
		for(i = 1; i <= 10 ; i++) {
			entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
			
			if (entrada % 2 == 0) {
				intFila.Enfileirar(entrada);
			}			
		}
		intFila.MostrarFila();
		System.exit(0);
	}
}

	
