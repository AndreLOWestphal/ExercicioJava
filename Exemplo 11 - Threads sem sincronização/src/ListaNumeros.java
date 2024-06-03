
public class ListaNumeros {
	void printTable(int n) {
		for(int i = 0; i <= 4; i++) {
			System.out.println(n + i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
