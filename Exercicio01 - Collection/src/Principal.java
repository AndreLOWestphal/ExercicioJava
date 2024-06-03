import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		String text1 = "Os numeros armazenados são: ";
		String text2 = "A soma dos números armazenados é: ";
		Integer soma = 0;
				
		for(int i = 0; i < 6; i++) {
		Integer numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = teclado.nextInt();
		listaNumeros.add(numero);
		soma += numero;
		}
		
		System.out.println(text1 + listaNumeros);
		System.out.println(text2 + soma);
	}
}
