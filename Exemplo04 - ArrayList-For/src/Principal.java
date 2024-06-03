import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
	
			ArrayList<String> listaNome = new ArrayList<>();
			
			listaNome.add("Oswaldo");
			listaNome.add("Gisele");
			listaNome.add("Giovanna");
			listaNome.add("Giuliana");
			
			System.out.println("Antes:------ ");
			
			for(String nome: listaNome) {
				System.out.println(nome);
			}
			
			listaNome.set(0, "Jujuba");
			listaNome.remove(3);
			
			System.out.println("Depois:------ ");
			
			for(String nome: listaNome) {
				System.out.println(nome);
			}

	}

}
