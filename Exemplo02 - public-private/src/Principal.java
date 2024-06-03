import discents.AlunoSuperior;

public class Principal {

	public static void main(String[] args) {
		
		AlunoSuperior alunoSuperior = new AlunoSuperior();

		//alunoSuperior.nome = "Andre";
		alunoSuperior.setNome("Andre");
		
		//alunoSuperior.teste = 5;
		alunoSuperior.setTeste(5);
		//alunoSuperior.prova = 8;
		alunoSuperior.setProva(8);
		
		System.out.println("Aluno: " + alunoSuperior.getNome());
		System.out.println("Teste: " + alunoSuperior.getTeste() + ", " + "Prova: " + alunoSuperior.getProva());
		System.out.println("Nota Final: " + alunoSuperior.getMedia());
	}

}
