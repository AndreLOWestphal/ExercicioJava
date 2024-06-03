import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
			
			// organiza de forma rapida e aleatoria e consome menos memoria
			Set<String> listaNome = new HashSet<>();
			
			listaNome.add("Oswaldo");
			listaNome.add("Gisele");
			listaNome.add("Giovanna");
			listaNome.add("Giuliana");
			listaNome.add("André");
			
			System.out.println("Antes:------ ");
			
			for(String nome: listaNome) {
				System.out.println(nome);
			}
			
			//organiza por ordem, porém consome mais memoria
			/*Set<String> listaNome = new TreeSet<>();
			
			listaNome.add("Oswaldo");
			listaNome.add("Gisele");
			listaNome.add("Giovanna");
			listaNome.add("Giuliana");
			listaNome.add("André");
			;
			
			System.out.println("Antes:------ ");
			
			for(String nome: listaNome) {
				System.out.println(nome);
			}*/
	}

}
