import java.nio.Buffer;

public class Principal {

	public static void main(String[] args) {
		
		String nome = "Andre Luis de Oliveira";
		String nomeGuerra = "Andre";
		String sobrenome = new String("Andre");
		
		//if(nome==nomeGuerra) {
		if(nome.equals(nomeGuerra)) {
			System.out.println("São iguais");
		}else {
			System.out.println("Não são iguais");
			}
		//if(nome==sobrenome) {
		if(nome.equals(sobrenome)) {
			System.out.println("São iguais");
		}
		else {
			System.out.println("Não são iguais");
			}
		//Metodos intrínsecos de Strings
	System.out.println(nome);	
			
	System.out.println(nome.length());
	System.out.println(nome.toLowerCase());
	System.out.println(nome.toUpperCase());
	System.out.println(nome.charAt(2));
	System.out.println(nome.isEmpty());
	System.out.println(nome.indexOf("is"));
	System.out.println(nome.contains("Oli"));
	System.out.println(nome.concat("Luis"));
	System.out.println(nome.equals("andre luis"));
	System.out.println(nome.equalsIgnoreCase("andre luis de oliveira"));
	
	String nome1 = "Jessica ";
	String sobreNome1 = "Paiva";
	String nomeCompBuffer;

	StringBuffer buffer = new StringBuffer();
	
	buffer.append(nome1);
	buffer.append(sobreNome1);
	
	nomeCompBuffer = buffer.toString();
	
	System.out.println(nomeCompBuffer);
	
	StringBuilder builder = new StringBuilder();
	
	builder.append(nome1);
	builder.append(sobreNome1);
	
	nomeCompBuffer = builder.toString();
	
	System.out.println(nomeCompBuffer);
	
	
	}

}
