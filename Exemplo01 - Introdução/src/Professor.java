
public class Professor extends Pessoa{
	
	double salario;
		
	public void setSalario(double salario) {
		this.salario = salario;
	}

	double getInss() {
		return salario * 0.11;
	}
	
	double getSalario (){
		return salario - getInss();
	}
		
}
