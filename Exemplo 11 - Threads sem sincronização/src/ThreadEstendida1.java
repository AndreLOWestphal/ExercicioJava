
public class ThreadEstendida1 extends Thread{
	ListaNumeros listaNumeros;
	
	ThreadEstendida1(ListaNumeros listaNumeros){
		this.listaNumeros = listaNumeros;
	}
	
	public void run() {
		listaNumeros.printTable(10);
	}
	
}
