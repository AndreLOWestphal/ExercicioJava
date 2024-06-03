import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Principal {

	public static void main(String[] args) {
		
		final String usuario = "postgres";
		final String senha = "admin123";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String driverBanco = "org.postgresql.Driver";
		final String instrucaoInsert = "INSERT INTO PESSOAS(id, nome) VALUES(?,?)";
		final String instrucaoUpDateNome = "UPDATE PESSOAS SET nome=? WHERE id=?";
		final String instrucaoUpDateId = "UPDATE PESSOAS SET id=? WHERE nome=?";
	
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoInsert);
			preparedStatement.setInt(1, 7);
			preparedStatement.setString(2, "Julia");
			
			preparedStatement.executeUpdate();
			
			System.out.println("Conexão bem sucedida");
			System.out.println("Inclusão realizada");
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

}
