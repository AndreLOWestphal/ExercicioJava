import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {
		
		final String usuario = "postgres";
		final String senha = "admin123";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String driverBanco = "org.postgresql.Driver";
		final String instrucaoSelect = "SELECT * FROM pessoas";
	
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoSelect);
			
			System.out.println("Conexão bem sucedida");
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				System.out.println("Id: " + id + " Nome: " + nome);
			}
			
			System.out.println("Consulta Realizada");
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

}
