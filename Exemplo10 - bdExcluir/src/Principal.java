import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {

	public static void main(String[] args) {
		
		final String usuario = "postgres";
		final String senha = "admin123";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String driverBanco = "org.postgresql.Driver";
		final String instrucaoDelete = "DELETE FROM pessoas WHERE id=?";
	
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoDelete);
			
			System.out.println("Conexão bem sucedida");
			
			preparedStatement.setInt(1, 7);
			preparedStatement.executeUpdate();
						
			System.out.println("Exclusão realizada");
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

}