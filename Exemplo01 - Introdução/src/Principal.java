
public class Principal {

	public static void main(String[] args) {
		
		AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();
		
		alunoEnsinoMedio.setNome("Andre");
		alunoEnsinoMedio.teste = 8;
		alunoEnsinoMedio.prova = 9;
		
		alunoEnsinoSuperior.setNome("Jessica");
		alunoEnsinoSuperior.teste = 8;
		alunoEnsinoSuperior.prova = 9;
		
		System.out.println("Aluno Ensino Médio:");
		System.out.println("Nome: " + alunoEnsinoMedio.getNome());
		System.out.println("Média: " + alunoEnsinoMedio.getMedia());
		
		System.out.println("Aluno Ensino Superior:");
		System.out.println("Nome: " + alunoEnsinoSuperior.getNome());
		System.out.println("Média: " + alunoEnsinoSuperior.getMedia());
		
		
	}

}
