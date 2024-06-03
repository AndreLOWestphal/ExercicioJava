import javax.swing.*;

public class CalculoSimples {

	public static void main(String[] args) {
		
		double num1, num2;
		String operador;
		
		num1 = (Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: ")));
		num2 = (Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero: ")));

		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num1 / num2;
		
		
		System.out.println("A soma dos valores é," + soma);
		System.out.println("A subtração dos valores é," + subtracao);
		System.out.println("A multiplicação dos valores é," + multiplicacao);
		System.out.println("A divisão dos valores é," + divisao);
		

	}

}
