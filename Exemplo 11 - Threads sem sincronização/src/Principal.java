
public class Principal {

	public static void main(String[] args) {
		
		ListaNumeros listaNumeros = new ListaNumeros();
		ThreadEstendida1 minhaThread1 = new ThreadEstendida1(listaNumeros);
		ThreadEstendida2 minhaThread2 = new ThreadEstendida2(listaNumeros);
		minhaThread1.start();
		minhaThread2.start();

	}

}
